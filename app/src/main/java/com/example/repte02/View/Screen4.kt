package com.example.repte02.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte02.R


@Composable
fun Screen4(navController: NavController, muñeco: String, nombre: String) {

    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "logo"
            )
            Image(
                painter = painterResource(
                    id = when (muñeco) {
                        "goku" -> R.drawable.goku
                        "vegeta" -> R.drawable.vegeta
                        "supreme" -> R.drawable.supreme
                        "piccolo" -> R.drawable.piccolo
                        "gomah" -> R.drawable.gomah
                        "masked" -> R.drawable.masked_majin
                        else -> R.drawable.goku
                    }
                ),
                contentDescription = "Muñeco Seleccionado",
                modifier = Modifier
                    .width(250.dp)
                    .height(250.dp)
            )
            Text(nombre, modifier = Modifier.size(50.dp))
        }
    }

}

