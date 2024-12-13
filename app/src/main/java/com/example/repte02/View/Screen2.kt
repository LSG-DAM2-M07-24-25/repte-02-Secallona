package com.example.repte02.View

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.repte02.R
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.repte02.Routes


@Composable
fun Screen2(navController: NavController){
    var muñecoSeleccionado by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()
    ){
        Column( modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "logo"
            )

            Row {
                Button(onClick = { muñecoSeleccionado = "goku" }) {
                    Image(
                        painter = painterResource(id = R.drawable.goku),
                        contentDescription = "goku"

                    )
                }

                Button(onClick = {muñecoSeleccionado = "vegeta"}) {
                    Image(
                        painter = painterResource(id = R.drawable.vegeta),
                        contentDescription = "vegeta"
                    )
                }
                Button(onClick = {muñecoSeleccionado = "gomah"}) {
                    Image(
                        painter = painterResource(id = R.drawable.gomah),
                        contentDescription = "gomah"
                    )
                }
            }
            Spacer(modifier = Modifier.size(30.dp))
            Row {
                Button(onClick = { muñecoSeleccionado = "piccolo" }) {
                    Image(
                        painter = painterResource(id = R.drawable.piccolo),
                        contentDescription = "piccolo"

                    )
                }

                Button(onClick = {muñecoSeleccionado = "majin"}) {
                    Image(
                        painter = painterResource(id = R.drawable.masked_majin),
                        contentDescription = "majin"
                    )
                }
                Button(onClick = {muñecoSeleccionado = "supreme"}) {
                    Image(
                        painter = painterResource(id = R.drawable.supreme),
                        contentDescription = "supreme"
                    )
                }
            }

            Button(
                onClick = {navController.navigate(Routes.Pantalla3.createRoute(muñecoSeleccionado))},
                enabled = muñecoSeleccionado.isNotEmpty(),
                ) { Text("Continuar") }
        }
    }
}