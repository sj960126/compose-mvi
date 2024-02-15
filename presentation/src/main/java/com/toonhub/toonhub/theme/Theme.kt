package com.toonhub.toonhub.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

/**
 * @author songhyeonsu
 * Created 2/13/24 at 6:08 PM
 */

@Composable
fun HubTheme(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider {
        MaterialTheme(
            content = content,
            typography = HubTypography
        )
    }
}

