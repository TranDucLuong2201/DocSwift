package com.dluong.docswift.presentation.screens.splash_screen

import com.dluong.docswift.domain.authentication.AccountService
import com.dluong.docswift.navigation.Screen
import com.dluong.docswift.presentation.screens.DocSwiftViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
    private val accountService: AccountService
) : DocSwiftViewModel() {

    fun onAppStart(openAndPopUp: (String, String) -> Unit) {
//        if (accountService.hasUser())
            openAndPopUp(Screen.SignIn.route, Screen.Splash.route)
//        else createAnonymousAccount(openAndPopUp)
    }

    private fun createAnonymousAccount(openAndPopUp: (String, String) -> Unit) {
        launchCatching {
            accountService.createAnonymousAccount()
            openAndPopUp(Screen.SignIn.route, Screen.Splash.route)
        }
    }

}