package com.example.repte02.View

import android.text.Layout.Alignment
import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.repte02.R
import com.example.repte02.Routes
import androidx.compose.ui.Modifier

@Composable
fun Screen1(navController: NavController) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = androidx.compose.ui.Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.dragonball_daima_logo),
                contentDescription = "Logo"
            )
            Spacer(modifier = Modifier.size(30.dp))

            Button(
                onClick = {
                    navController.navigate(Routes.Pantalla2.route)
                }, shape = RoundedCornerShape(8.dp)
            ) {
                Text("Entrar")
            }
        }
    }
}
