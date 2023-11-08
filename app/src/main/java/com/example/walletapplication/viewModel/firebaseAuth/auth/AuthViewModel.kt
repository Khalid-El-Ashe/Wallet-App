package com.example.walletapplication.viewModel.firebaseAuth.auth

import android.app.Activity
import androidx.lifecycle.ViewModel
import com.example.walletapplication.viewModel.firebaseAuth.repository.AuthRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(private val repository: AuthRepository) : ViewModel() {

    fun createUserWithPhone(phone: String, activity: Activity) =
        repository.createUserWithPhone(phone = phone, activity = activity)

    fun signUserWithCredential(otp: String) = repository.signUserWithPhone(otp = otp)

}