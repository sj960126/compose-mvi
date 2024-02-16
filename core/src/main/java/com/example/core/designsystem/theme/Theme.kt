package com.example.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf

/**
 * @author songhyeonsu
 * Created 2/13/24 at 6:08 PM
 */

val LocalColors = staticCompositionLocalOf { lightSearchColors }
val LocalTypography = staticCompositionLocalOf { TypographySystem(lightSearchColors) }

@Composable
fun HubTheme(
    isDarkMode: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colors = if(isDarkMode) darkSearchColors else lightSearchColors
    val typographySystem = TypographySystem(colors)
    CompositionLocalProvider(
        LocalColors provides colors,
        LocalTypography provides typographySystem,
        content = content
    )
}


