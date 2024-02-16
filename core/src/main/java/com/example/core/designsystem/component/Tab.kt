package com.example.core.designsystem.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Tab
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.core.designsystem.theme.LocalColors
import com.example.core.designsystem.theme.LocalTypography

/**
 * @author songhyeonsu
 * Created 2/16/24 at 6:10 PM
 */

@Composable
fun DefaultTab(
    selected : Boolean,
    onCLick : () -> Unit,
    modifier: Modifier = Modifier,
    enable : Boolean = false,
    text : @Composable () -> Unit
){
    Tab(
        selected = selected,
        onClick = onCLick,
        modifier = modifier,
        enabled = enable,
        selectedContentColor = LocalColors.current.primary,
        unselectedContentColor = LocalColors.current.white
    ) {

    }
}

private val defaultPadding = 6.dp
