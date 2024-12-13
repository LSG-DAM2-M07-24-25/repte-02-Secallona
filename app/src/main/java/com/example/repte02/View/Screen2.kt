package com.example.repte02.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.repte02.R
import java.lang.reflect.Modifier


@Composable
fun Screen2(navController: NavController){
    var muñecoSeleccionado by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()
    ){
        Column( modifier = Modifier.fillMaxWidth().fillMaxHeight() ) {
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "logo",
                modifier = Modifier.
            )
        }
    }
}