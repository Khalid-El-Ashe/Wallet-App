package com.example.walletapplication.viewModel.firebaseAuth.repository

import android.app.Activity
import com.example.walletapplication.utils.AuthUser
import com.example.walletapplication.utils.ResultState
import kotlinx.coroutines.flow.Flow

interface AuthRepository {

    // i need to make this function to create user by Email
//    fun createUser(authUser: AuthUser): Flow<ResultState<String>>

    // i need to make this function to login user by Email
//    fun loginUser(authUser: AuthUser): Flow<ResultState<String>>

    // i need to make this function to create user by phone
    fun createUserWithPhone(phone: String, activity: Activity): Flow<ResultState<String>>

    // i need to make this function to login user by phone
    fun signUserWithPhone(otp: String): Flow<ResultState<String>>

}