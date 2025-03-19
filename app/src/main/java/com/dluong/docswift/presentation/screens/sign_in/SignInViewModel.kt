package com.dluong.docswift.presentation.screens.sign_in

import com.dluong.docswift.domain.authentication.AccountService
import com.dluong.docswift.navigation.Screen
import com.dluong.docswift.presentation.screens.DocSwiftViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class SignInViewModel @Inject constructor(
    private val accountService: AccountService
) : DocSwiftViewModel() {

    private val _email = MutableStateFlow("")
    val email: StateFlow<String> = _email.asStateFlow()
    private val _password = MutableStateFlow("")
    val password: StateFlow<String> = _password.asStateFlow()

    fun updateEmail(newEmail: String) {
        _email.value = newEmail
    }

    fun updatePassword(newPassword: String) {
        _password.value = newPassword
    }

    fun onSignInClick(openAndPopUp: (String, String) -> Unit) {
        launchCatching {
            accountService.signIn(_email.value, _password.value)
            openAndPopUp(Screen.Home.route, Screen.SignIn.route)
        }
    }


    fun onSignUpClick(navigate: (String) -> Unit) {
        navigate(Screen.SignUp.route)
    }

}