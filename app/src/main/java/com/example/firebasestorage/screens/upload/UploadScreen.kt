package com.example.firebasestorage.screens.upload

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun UploadScreen(navController: NavHostController){
    Column (modifier = Modifier.fillMaxSize()) {


    }

}
@Preview(showBackground = true)
@Composable
fun UploadScreenPreview(){
    UploadScreen(rememberNavController())
}

