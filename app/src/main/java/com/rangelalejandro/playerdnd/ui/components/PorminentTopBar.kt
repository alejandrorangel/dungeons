package com.rangelalejandro.playerdnd.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.tween
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.selection.selectableGroup
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.clearAndSetSemantics
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.rangelalejandro.playerdnd.Destination

@Composable
fun ProminentTopBar(title: String) {
    Surface(shadowElevation = 4.dp, modifier = Modifier
        .height(TabHeight)
        .fillMaxWidth()) {
        Column(
            Modifier
                .padding(start = 16.dp, top = 20.dp, end = 16.dp, 24.dp),
            
        ) {
            Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                Box(modifier = Modifier.size(40.dp)){
                    Icon(imageVector = Icons.Filled.Home, contentDescription = "home", modifier = Modifier.size(24.dp))
                }
            }
            Row(horizontalArrangement = Arrangement.spacedBy(24.dp)) {
                Text(text = title, style = MaterialTheme.typography.titleLarge)
            }
        }
    }

}

@Preview
@Composable
fun PreviewProminentTopBar(){
    ProminentTopBar(title = "Title")
}

private val TabHeight = 112.dp