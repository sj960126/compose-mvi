package com.example.core.designsystem.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Dialog
import com.example.core.designsystem.theme.HubTheme
import com.example.core.designsystem.theme.LocalColors
import com.example.core.designsystem.theme.LocalTypography

/**
 * @author songhyeonsu
 * Created 3/5/24 at 4:01 PM
 */

@Composable
fun DialogContainer(
    roundedCornerShape: Int,
    content : @Composable ()-> Unit
){
    Dialog(onDismissRequest = {}) {
        Surface(
            modifier = Modifier
                .wrapContentWidth(align = Alignment.CenterHorizontally)
                .wrapContentHeight(),
            shape = RoundedCornerShape(roundedCornerShape.dp),
            color = LocalColors.current.white
        ) {
            content()
        }
    }
}

@Composable
fun DialogContent(
    title : @Composable () -> Unit,
    descriptionText : String?,
    positiveText : String?,
    negativeText : String,
    positiveOnClick : () -> Unit,
    negativeOnClick : () -> Unit
){
    Column(horizontalAlignment = Alignment.CenterHorizontally, modifier = Modifier.padding(horizontal = 20.dp, vertical = 20.dp)) {
        title()
        if(descriptionText?.isNotBlank() == true){
            Spacer(modifier = Modifier.size(5.dp))
            Text(text = descriptionText, color = LocalColors.current.gray01,  modifier = Modifier.padding(horizontal = 20.dp))
            Spacer(modifier = Modifier.size(40.dp))
        }
        Box(modifier = Modifier.fillMaxWidth()) {
            if(positiveText?.isNotBlank() == true){
                Box(modifier = Modifier
                    .align(Alignment.CenterStart)
                    .background(
                        color = LocalColors.current.gray08,
                        shape = RoundedCornerShape(8.dp)
                    )) {
                    Text(text = positiveText, modifier = Modifier
                        .clickable { positiveOnClick() }
                        .padding(horizontal = 55.dp, vertical = 13.dp)
                    )
                }
            }
            Box(contentAlignment = Alignment.BottomCenter,modifier = Modifier
                .align(Alignment.CenterEnd)
                .background(color = LocalColors.current.primary, shape = RoundedCornerShape(8.dp))) {
                Text(text = negativeText, modifier = Modifier
                    .clickable { negativeOnClick() }
                    .padding(horizontal = 55.dp, vertical = 13.dp),
                    color = LocalColors.current.white
                )
            }
        }
    }
}

@Preview
@Composable
fun DialogPreview(){
    HubTheme {
        DialogContainer(roundedCornerShape = 8, content ={
            DialogContent(
                title = { Text(text = "팝업", color = LocalColors.current.gray01, style = LocalTypography.current.h1, textAlign = TextAlign.Center, modifier = Modifier.padding(top = 24.dp,bottom =24.dp ))},
                descriptionText ="팝업의 컨텐츠 내용",
                positiveText = "취소",
                negativeText = "동의",
                positiveOnClick = {},
                negativeOnClick = {}
            )
        })
    }
}