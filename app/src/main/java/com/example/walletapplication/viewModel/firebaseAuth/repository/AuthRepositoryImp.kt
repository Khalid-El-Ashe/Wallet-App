package com.example.walletapplication.viewModel.firebaseAuth.repository

import android.app.Activity
import com.example.walletapplication.utils.ResultState
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthOptions
import com.google.firebase.auth.PhoneAuthProvider
import kotlinx.coroutines.channels.awaitClose
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.callbackFlow
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class AuthRepositoryImp @Inject constructor(private val auth: FirebaseAuth) : AuthRepository {
    private lateinit var onVerificationCode: String

    override fun createUserWithPhone(phone: String, activity: Activity): Flow<ResultState<String>> =
        callbackFlow {
            trySend(ResultState.Loading)

            val onVerificationCallback =
                object : PhoneAuthProvider.OnVerificationStateChangedCallbacks() {
                    override fun onVerificationCompleted(p0: PhoneAuthCredential) {

                    }

                    override fun onVerificationFailed(p0: FirebaseException) {
                        trySend(ResultState.Failure(p0))
                    }

                    override fun onCodeSent(
                        verficationCode: String,
                        p1: PhoneAuthProvider.ForceResendingToken
                    ) {
                        super.onCodeSent(verficationCode, p1)
                        trySend(ResultState.Success("OTP Sent Successfully"))
                        onVerificationCode = verficationCode
                    }
                }

            val options = PhoneAuthOptions.newBuilder(auth).setPhoneNumber("+97$phone")
                .setTimeout(60L, TimeUnit.SECONDS).setActivity(activity)
                .setCallbacks(onVerificationCallback).build()

            PhoneAuthProvider.verifyPhoneNumber(options)

            awaitClose {
                close()
            }
        }

    override fun signUserWithPhone(otp: String): Flow<ResultState<String>> = callbackFlow {
        trySend(ResultState.Loading)

        val credential = PhoneAuthProvider.getCredential(onVerificationCode, otp)

        auth.signInWithCredential(credential)
            .addOnCompleteListener {
                if (it.isSuccessful)
                    trySend(ResultState.Success("OTP Verified"))
            }
            .addOnFailureListener {
                trySend(ResultState.Failure(it))
            }

        awaitClose {
            close()
        }
    }
}