package com.dluong.docswift.data.use_case.sign_in

data class SignInState(
    val isSignInState: Boolean = false,
    val signInError: String? = null
)
