package com.dluong.docswift.navigation

import androidx.compose.runtime.Stable
import androidx.navigation.NavHostController

@Stable
class DocSwiftAppState(val navController: NavHostController) {
    fun popUp() {
        navController.navigateUp()
    }

    fun navigate(route: String) {
        navController.navigate(route) { launchSingleTop = true }
    }

    fun navigateAndPopUp(route: String, popUp: String) {
        navController.navigate(route) {
            launchSingleTop = true
            popUpTo(popUp) { inclusive = true }
        }
    }

    fun clearAndNavigate(route: String) {
        navController.navigate(route) {
            launchSingleTop = true
            popUpTo(0) { inclusive = true }
        }
    }
}
