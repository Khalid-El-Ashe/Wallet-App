package com.example.walletapplication.di

import com.example.walletapplication.viewModel.firebaseAuth.repository.AuthRepository
import com.example.walletapplication.viewModel.firebaseAuth.repository.AuthRepositoryImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class RepositoryModel {

    @Binds
    abstract fun providesFirebaseAuthRepository(repo: AuthRepositoryImp): AuthRepository
}