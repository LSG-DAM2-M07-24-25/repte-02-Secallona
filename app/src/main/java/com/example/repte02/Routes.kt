package com.example.repte02


sealed class Routes(val route: String) {
    object Pantalla1 : Routes("pantalla1")
    object Pantalla2 : Routes("pantalla2")
    object Pantalla3 : Routes("pantalla3/{muñeco}") {
        fun createRoute(muñeco: String) = "pantalla3/$muñeco"
    }

    object Pantalla4 : Routes("pantalla4/{nombre}") {
        fun createRoute(nombre: String) = "pantalla4/$nombre"
    }
}
