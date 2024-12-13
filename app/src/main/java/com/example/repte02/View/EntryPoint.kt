package com.example.repte02.View


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument
import com.example.repte02.Routes


/**
 * Definim el composable NavHost que el cridarem des del Main
 * @param navigationController
 * @author RIS
 * @since 2024-11-20
 */
@Composable
fun EntryPoint(navigationController: NavHostController) {
    NavHost(
        navController = navigationController,
        startDestination = Routes.Pantalla1.route
    ) {
        composable(Routes.Pantalla1.route) { Screen1(navigationController) }

        composable(Routes.Pantalla2.route){ Screen2(navigationController) }



        composable(
            Routes.Pantalla3.route,
            arguments = listOf(
                navArgument("muñeco") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            Screen3(
                navController = navigationController,
                muñeco = backStackEntry.arguments?.getString("muñeco").orEmpty()
            )
        }



        composable(
            Routes.Pantalla4.route,
            arguments = listOf(
                navArgument("muñeco") { type = NavType.StringType },
                navArgument("nombre") { type = NavType.StringType }
            )
        ) { backStackEntry ->
            Screen4(
                navController = navigationController,
                muñeco = backStackEntry.arguments?.getString("muñeco").orEmpty(),
                nombre = backStackEntry.arguments?.getString("nombre").orEmpty(),

            )
        }
    }
}
