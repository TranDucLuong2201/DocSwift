package com.dluong.docswift.navigation

sealed class Screen(val route: String) {
    data object Splash : Screen("splash_screen")
    data object Welcome : Screen("welcome_screen")
    data object SignIn : Screen("sign_in_screen")
    data object SignUp : Screen("sign_up_screen")
    data object ForgetPassword : Screen("forget_password_screen")
    data object Home : Screen("home_screen")
    data object Search : Screen("search_screen")
    data object Filter : Screen("filter_screen")
    data object Detail : Screen("detail_screen")
}