package br.senai.sp.jandira.bmi.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable

fun UserDataa(modifier: Modifier = Modifier){

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                color = Color.Green
            )
    ){
        Column (

        ){  }
    }


}

@Preview(showSystemUi = true)
@Composable
private fun HomeScreenPreview() {
    UserDataa()
}