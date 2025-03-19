package com.dluong.docswift

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.dluong.docswift.navigation.Screen
import com.dluong.docswift.navigation.rememberAppState
import com.dluong.docswift.navigation.setupNavGraph
import com.dluong.docswift.ui.theme.DocSwiftTheme

@Composable
fun DocSwiftApp() {
    DocSwiftTheme {
        Surface(color = MaterialTheme.colorScheme.background) {
            val appState = rememberAppState()

            Scaffold { innerPaddingModifier ->
                NavHost(
                    navController = appState.navController,
                    startDestination = Screen.Splash.route,
                    modifier = Modifier.padding(innerPaddingModifier)
                ) {
                    setupNavGraph(appState)
                }
            }
        }
    }
}