package com.dluong.docswift.di

import com.dluong.docswift.data.repository.AccountServiceImpl
import com.dluong.docswift.domain.authentication.AccountService
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ServiceModule {
    @Binds
    abstract fun provideAccountService(impl: AccountServiceImpl): AccountService
}