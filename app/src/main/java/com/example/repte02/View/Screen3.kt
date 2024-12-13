package com.example.repte02.View

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
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


@SuppressLint("UnrememberedMutableInteractionSource")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Screen3(navController: NavController, muñeco: String) {
    var nombre by remember { mutableStateOf("") }

    Box(){

        Column(modifier = Modifier.align(Alignment.Center)) {
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
                readOnly = true,
                textStyle = TextStyle(),
                label = { },
                placeholder = { Text(text = "Nom del personatge") },
                leadingIcon = { },
                trailingIcon = { },
                isError = true,
                singleLine = true,
                maxLines = 1,
                minLines = 1,
            )

            Spacer(modifier = Modifier.size(50.dp))

            //Button(onClick = {navController.navigate(Routes.Routes.Pantalla4.createRoute(nombre))}) { }
        }
    }


}