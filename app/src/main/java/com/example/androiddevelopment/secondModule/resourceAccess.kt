package com.example.androiddevelopment.secondModule

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.androiddevelopment.R

@Composable
fun AccessResources(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Text(text = stringResource(R.string.dev_name),
            color= colorResource(R.color.blue))
    }
}


@Composable
fun AccessImage(){
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        Image(
            painter = painterResource(R.drawable.back),
            contentDescription = "Back Image"
        )
    }
}

//@Preview(showSystemUi = true)
@Composable
fun AccessSystemResource(){
    AccessResources()
}

//@Preview(showSystemUi = true)
@Composable
fun AccessSystemResourceImage(){
    AccessImage()
}