package com.example.walletapplication.di

import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton
import com.google.firebase.ktx.Firebase

@Module
@InstallIn(SingletonComponent::class)
object FirebaseModelInject {

    @Singleton
    @Provides
    fun providesFirebaseAuth():FirebaseAuth = Firebase.auth
}