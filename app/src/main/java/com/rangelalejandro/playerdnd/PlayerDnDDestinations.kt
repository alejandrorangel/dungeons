package com.rangelalejandro.playerdnd

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.ui.graphics.vector.ImageVector

interface Destination {
    val icon: ImageVector
    val title: String
    val route: String
}


/**
 * app navigation destinations
 */
object Home : Destination {
    override val icon = Icons.Filled.Home
    override val route = "home"
    override val title = "Home"
}

// Screens to be displayed in the top RallyTabRow
val appScreens = listOf(Home)