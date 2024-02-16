package com.example.core.designsystem.component

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.core.designsystem.theme.HubTheme
import com.example.core.designsystem.theme.LocalColors
import com.example.core.designsystem.theme.LocalTypography

/**
 * @author songhyeonsu
 * Created 2/16/24 at 4:35 PM
 */

@Composable
fun DefaultButton(
    onClick : () -> Unit,
    modifier: Modifier = Modifier,
    enabled : Boolean = false ,
    contentPadding : PaddingValues = ButtonDefaults.ContentPadding,
    content : @Composable RowScope.() -> Unit,
){
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = LocalColors.current.primary,
            contentColor = LocalColors.current.white,
            disabledBackgroundColor = LocalColors.current.gray04,
            disabledContentColor = LocalColors.current.white
        ),
        shape = RoundedCornerShape(12.dp),
        contentPadding =contentPadding,
        content = content
    )
}


@Composable
private fun DefaultButtonContent(
    text : @Composable () -> Unit,
    modifier: Modifier = Modifier,
    paddingValues: PaddingValues
){
    Column(
        modifier = modifier
            .padding(paddingValues = paddingValues)
            .wrapContentHeight(),
        verticalArrangement = Arrangement.Center
    ){
        text()
    }
}

@Preview
@Composable
fun ButtonPreview(){
    HubTheme {
        DefaultButton(
            enabled = true,
            onClick = { Log.d("디버그","onCLick") },
            contentPadding = PaddingValues(15.dp)
        ) {
            DefaultButtonContent(text = { Text("확인",style = LocalTypography.current.button) }, paddingValues = PaddingValues(12.dp))
        }
    }
}

