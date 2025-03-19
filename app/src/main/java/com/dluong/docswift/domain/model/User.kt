package com.dluong.docswift.domain.model


data class User(
//    val address: String,
//    val createdAt: String,
    val email: String,
    val fullName: String,
//    val isVerified: Boolean,
//    val oauthId: String,
//    val oauthProvider: String,
    val password: String,
//    val phoneNumber: String,
//    val role: String,
//    val updatedAt: String,
//    val userId: Int,
    val profilePictureUrl: String?
)

data class SignInResult(
    val data: User?,
    val errorMessage: String?
)
