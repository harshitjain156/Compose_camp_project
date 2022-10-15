package com.example.compose_camp_project

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.compose_camp_project.home.Home

@Composable
fun AppNavigator(navHostController: NavHostController) {

    NavHost(navController =navHostController , startDestination ="Onboarding") {
        composable("Onboarding"){
            Chat{navHostController.navigate("Login")}
        }
        composable("Login"){
            Login{
                navHostController.navigate("Details")
            }
        }
        composable("Details"){
            Home()
        }
    }
}