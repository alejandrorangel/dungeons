package com.rangelalejandro.playerdnd

import android.os.Bundle
import android.view.WindowInsets
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.rangelalejandro.playerdnd.ui.components.ProminentTopBar
import com.rangelalejandro.playerdnd.ui.home.HomeScreen
import com.rangelalejandro.playerdnd.ui.theme.PlayerDnDTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PlayerDndApp()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerDndApp() {
    PlayerDnDTheme {
        val navController = rememberNavController()
        val currentBackStack by navController.currentBackStackEntryAsState()
        val currentDestination = currentBackStack?.destination
        val currentScreen =
            appScreens.find { it.route == currentDestination?.route } ?: Home
        Scaffold(
            topBar = {
                ProminentTopBar(title = currentScreen.title)
            }
        ) { paddingInset ->
            HomeScreen(paddingInset)
        }
    }
}