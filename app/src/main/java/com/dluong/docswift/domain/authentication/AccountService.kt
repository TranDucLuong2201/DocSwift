package com.dluong.docswift.domain.authentication

import com.dluong.docswift.domain.model.User
import com.dluong.docswift.navigation.Screen
import kotlinx.coroutines.flow.Flow


interface AccountService {
    val currentUser: Flow<User?>
    val currentUserId: String
    fun hasUser(): Boolean
    suspend fun createAnonymousAccount()
    suspend fun signIn(email: String, password: String)
    suspend fun signUp(email: String, password: String)
    suspend fun signOut()
    suspend fun deleteAccount()
}