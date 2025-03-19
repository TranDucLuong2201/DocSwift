package com.dluong.docswift.presentation.screens.reset_password

import com.dluong.docswift.domain.authentication.AccountService
import com.dluong.docswift.presentation.screens.DocSwiftViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import javax.inject.Inject

@HiltViewModel
class SignUpViewModel @Inject constructor(
    private val accountService: AccountService
) : DocSwiftViewModel() {

    private val email = MutableStateFlow("")
    private val password = MutableStateFlow("")

    fun updateEmail(newEmail: String) {
        email.value = newEmail
    }

    fun updatePassword(newPassword: String) {
        password.value = newPassword
    }

//    fun onSignInClick(openAndPopUp: (String,String)->Unit) {
//        launchCatching {
//            accountService.signIn(email.value, password.value)
//            openAndPopUp()
//        }
//    }

//    fun onSignUpClick(openAndPopUp: (String, String) -> Unit) {
//        openAndPopUp(SIGNUP)
//    }

}