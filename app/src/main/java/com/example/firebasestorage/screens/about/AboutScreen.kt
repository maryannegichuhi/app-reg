package com.example.firebasestorage.screens.about

import android.content.Intent
import android.provider.Settings
import android.widget.Toast
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.firebasestorage.navigation.ROUT_HOME
import com.example.firebasestorage.navigation.ROUT_SIGNUP

@Composable
fun AboutScreen(navController: NavHostController){
    var context = LocalContext.current
   Column(modifier = Modifier.fillMaxSize()){

       //TopAppBar
       TopAppBar(title = { androidx.compose.material.Text(text = "Sign in") },
           navigationIcon = {
               IconButton(onClick = {
                   navController.navigate(ROUT_SIGNUP)
               }) {
                   Icon(imageVector = Icons.Filled.ArrowBack , contentDescription = "arrowback")
               }
           },
           actions = {
               IconButton(onClick = {
                   val shareIntent= Intent(Intent.ACTION_SEND)
                   shareIntent.type="text/plain"
                   shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                   context.startActivity(Intent.createChooser(shareIntent, "Share"))


               }) {
                   Icon(imageVector = Icons.Filled.Share , contentDescription = "share")
               }
               IconButton(onClick = {
                   val settingsIntent= Intent(Settings.ACTION_SETTINGS)
                   context.startActivity(settingsIntent)
               }) {
                   Icon(imageVector = Icons.Filled.Settings , contentDescription = "settings")
               }
           },
           backgroundColor = Color.Green)

       Spacer(modifier = Modifier.height(20.dp))
       Button(onClick = {
           navController.navigate(ROUT_HOME)
           Toast.makeText(context,"Welcome to Home",Toast.LENGTH_LONG).show()

       }) {
           Text(text = "Home" )

       }

   }

}
@Preview(showBackground = true)
@Composable
fun AboutScreenPreview(){
   AboutScreen(rememberNavController())

}