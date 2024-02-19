package com.example.core.designsystem.component

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material.MaterialTheme
import androidx.compose.material.ProvideTextStyle
import androidx.compose.material.Tab
import androidx.compose.material.TabRow
import androidx.compose.material.TabRowDefaults
import androidx.compose.material.TabRowDefaults.tabIndicatorOffset
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core.designsystem.theme.HubTheme
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
        modifier = modifier
            .padding(horizontal = 12.dp, vertical = 5.dp),
        enabled = enable,
        selectedContentColor = LocalColors.current.white,
        unselectedContentColor = LocalColors.current.white,
        text = text
    )
}

@Composable
fun HubTabRow(
    selectedTabIndex : Int,
    modifier: Modifier = Modifier,
    tabs : @Composable () -> Unit,
){
    TabRow(
        selectedTabIndex = selectedTabIndex,
        modifier =
        modifier
            .fillMaxWidth()
            .wrapContentHeight()
        ,
        contentColor = LocalColors.current.primary,
        backgroundColor = LocalColors.current.white,
        indicator = {
            TabRowDefaults.Indicator(
                modifier = Modifier.tabIndicatorOffset(it[selectedTabIndex]),
                height = 2.dp,
                color = LocalColors.current.primary
            )
        },
        tabs = tabs
        )
}

@Preview
@Composable
fun TabPreview(){
    HubTheme {
        val tabs = ArrayList<String>().apply {
            add("검색")
            add("마이페이지")
        }
        HubTabRow(selectedTabIndex = 0) {
            tabs.forEachIndexed { index, title ->
                DefaultTab(
                    selected = index == 0,
                    onCLick = {},
                    text = { Text(
                        text = title,
                        style = LocalTypography.current.h2,
                        color = LocalColors.current.black,
                        modifier = Modifier.padding(horizontal = 0.dp, vertical = 12.dp))
                    }
                )
            }
        }
    }
}

private val defaultPadding = 6.dp
