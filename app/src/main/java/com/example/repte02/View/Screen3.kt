package com.example.repte02.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte02.R
import com.example.repte02.Routes


@SuppressLint("UnrememberedMutableInteractionSource")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen3(navController: NavController, muñeco: String) {
    var nombre by remember { mutableStateOf("") }

    Box(modifier = Modifier.fillMaxSize()){

        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "logo")

            Spacer(modifier = Modifier.size(30.dp))

            OutlinedTextField(
                value = nombre,
                onValueChange = { it ->
                    nombre = it
                },
                modifier = Modifier,
                enabled = true,
                readOnly = false,
                textStyle = TextStyle(),
                label = { },
                placeholder = { Text(text = "Nom del personatge") },
                isError = true,
                singleLine = true,
                maxLines = 1,
                minLines = 1,
            )

            Spacer(modifier = Modifier.size(50.dp))

            Button(onClick = {navController.navigate(Routes.Pantalla4.createRoute(nombre, muñeco))}) { }
        }
    }


}