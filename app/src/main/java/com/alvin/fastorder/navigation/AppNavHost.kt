package com.alvin.fastorder.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.alvin.fastorder.ui.theme.Screens.Products.ProductScreen
import com.alvin.fastorder.ui.theme.Screens.home.HomeScreen
import com.alvin.fastorder.ui.theme.Screens.login.LoginScreen
import com.alvin.fastorder.ui.theme.Screens.register.RegisterScreen
import com.alvin.fastorder.ui.theme.Screens.splash.SplashScreen

@Composable
fun AppNavHost(modifier : Modifier = Modifier,
               navController: NavHostController = rememberNavController(),
               startDestination:String= ROUTE_LOGIN)
{
    NavHost(navController = navController,modifier=modifier ,startDestination =startDestination ) {
        composable(ROUTE_LOGIN){
            LoginScreen(navController)

        }
        composable(ROUTE_REGISTER){
            RegisterScreen(navController)
        }
        composable(ROUTE_SPLASH){
            SplashScreen(navController)
        }
        composable(ROUTE_PRODUCT){
            ProductScreen(navController)
        }
        composable(ROUTE_HOME){
            HomeScreen(navController)
        }

    }

}