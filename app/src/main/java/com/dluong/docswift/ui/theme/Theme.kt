package com.dluong.docswift.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = PrimaryColor, // Used for prominent elements like buttons
    onPrimary =OnPrimaryColor , // Text color on primary elements
    primaryContainer = PrimaryContainerColor, // Container background color
    onPrimaryContainer = OnPrimaryContainerColor, // Text color on primary container
    secondary = SecondaryColor, // Secondary background color
    onSecondary = OnSecondaryColor, // Text color on secondary elements
    secondaryContainer = SecondaryContainerColor, // Secondary container background
    onSecondaryContainer = OnSecondaryContainerColor, // Text color on secondary container
    tertiary = ContentBodyDisplaySmall, // Tertiary background color
    onTertiary = ContentOnColor, // Text color on tertiary elements
    background = BackgroundColor, // Background color for app
    onBackground = OnBackgroundColor, // Text color on background
    surface = SurfaceColor, // Surface elements like cards
    onSurface = OnSurfaceColor, // Text color on surface
    error = ErrorColor, // Background color for error elements
    onError =  OnErrorColor // Text color on error elements
)

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryDarkColor, // Used for prominent elements like buttons
    onPrimary = OnPrimaryDarkColor, // Text color on primary elements
    primaryContainer = PrimaryContainerDarkColor, // Container background color
    onPrimaryContainer = OnPrimaryContainerDarkColor, // Text color on primary container
    secondary = SecondaryDarkColor, // Secondary background color
    onSecondary = OnSecondaryDarkColor, // Text color on secondary elements
    secondaryContainer = SecondaryContainerDarkColor, // Secondary container background
    onSecondaryContainer = OnSecondaryContainerDarkColor, // Text color on secondary container
    tertiary = ContentOnColor, // Tertiary background color
    onTertiary = ContentBodyDisplaySmall, // Text color on tertiary elements
    background = BackgroundDarkColor, // Background color for app
    onBackground = OnBackgroundDarkColor, // Text color on background
    surface = SurfaceDarkColor, // Surface elements like cards
    onSurface = OnSurfaceDarkColor, // Text color on surface
    error = ErrorDarkColor, // Background color for error elements
    onError = OnErrorDarkColor // Text color on error elements
)
@Composable
fun DocSwiftTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}