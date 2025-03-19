package com.dluong.docswift.navigation

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.dluong.docswift.presentation.screens.home.HomeScreen
import com.dluong.docswift.presentation.screens.sign_in.SignIn
import com.dluong.docswift.presentation.screens.sign_up.SignUp
import com.dluong.docswift.presentation.screens.splash_screen.SplashScreen
import com.dluong.docswift.presentation.screens.welcom.WelcomeScreen

@Composable
fun rememberAppState(navController: NavHostController = rememberNavController()) =
    remember(navController) {
        DocSwiftAppState(navController)
    }

fun NavGraphBuilder.setupNavGraph(appState: DocSwiftAppState) {
    composable(route = Screen.Splash.route) {
        SplashScreen(openAndPopUp = { route, popUp -> appState.navigateAndPopUp(route, popUp) })
    }
    composable(route = Screen.Welcome.route) {
//            WelcomeScreen(navController = navController)
    }
    composable(route = Screen.SignIn.route) {
        SignIn(navigate = { route -> appState.navigate(route) })
    }
    composable(route = Screen.SignUp.route) {
        SignUp(
            popUp = appState.popUp(),
            openAndPopUp = { route, popUp -> appState.navigateAndPopUp(route, popUp) })
    }
    composable(route = Screen.ForgetPassword.route) {}
    composable(route = Screen.Home.route) {
        HomeScreen()
    }
    composable(route = Screen.Search.route) {}
    composable(route = Screen.Filter.route) {}
    composable(route = Screen.Detail.route) {}
}