package com.example.poketrivial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.poketrivial.ui.theme.PoketrivialTheme
import com.example.poketrivial.ui.screens.GameScreen
import com.example.poketrivial.ui.screens.LaunchScreen
import com.example.poketrivial.ui.screens.MenuScreen
import com.example.poketrivial.ui.screens.ResultScreen
import com.example.poketrivial.ui.screens.SettingsScreen
import com.example.poketrivial.ui.screens.SplashScreen
import com.example.poketrivia.Routes

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            PoketrivialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = Routes.SplashScreen.route
                    ) {
                        composable(Routes.SplashScreen.route) { SplashScreen(navController) }
                        composable(Routes.MenuScreen.route) { MenuScreen(navController) }
                        composable(Routes.GameScreen.route) { GameScreen(navController) }
                        composable(Routes.ResultScreen.route) { ResultScreen(navController) }
                        composable(Routes.SettingsScreen.route) { SettingsScreen(navController) }
                    }
                }
            }
        }
    }
}
