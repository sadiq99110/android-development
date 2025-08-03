package com.example.androiddevelopment.thirdModule

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.androiddevelopment.R

@Composable
fun DemoSimpleText(){

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Hello Demo Text(Jetpack Compose)",
            color = colorResource(R.color.blue),
            fontSize = 20.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(
                    color=Color.Green,
                    blurRadius = 10f)
            ))
    }
}

@Composable
fun NewColorfullText(){
    val colorList = listOf(
        Color.Blue,
        Color.Green,
        Color.Black,
        Color.Red,
        Color.Magenta,
        Color.Yellow
    )

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = buildAnnotatedString {
                append("Check Color \n ")
                withStyle(
                    SpanStyle(
                        brush = Brush.linearGradient(
                            colors = colorList
                        )
                    )
                ) {
                    append("because this is for testing")
                }
                append("\n this is also for test")
            }
        )
    }
}

@Composable
fun ScrollAbleText(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(
            text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s".repeat(50),
            maxLines = 2,
//            modifier = Modifier.basicMarquee(),
            fontSize = 20.sp,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun PreviewSimpleDemoText(){
//    DemoSimpleText()
//    NewColorfullText()
    ScrollAbleText()
}