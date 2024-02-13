package com.toonhub.toonhub.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

/**
 * @author songhyeonsu
 * Created 2/13/24 at 6:08 PM
 */

@Composable
fun nHubTheme(
    content: @Composable () -> Unit
) {
    MaterialTheme(
        content = content,
        typography = HubTypography
    )
}