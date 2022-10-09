package com.rangelalejandro.playerdnd.ui.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
fun HomeScreen(contentPadding: PaddingValues, viewModel: HomeViewModel = hiltViewModel()) {
    val state by viewModel.uiState.collectAsState()
    HomeContent(state, { viewModel.roll() },contentPadding )
}

@Composable
fun HomeContent(state: HomeUIState, onPress: () -> Unit, contentPadding: PaddingValues = PaddingValues(0.dp)){
    Box(modifier = Modifier
        .fillMaxSize()
        .padding(contentPadding)) {
        FloatingActionButton(onClick = onPress, modifier = Modifier
            .padding(24.dp)
            .align(Alignment.BottomEnd)) {
            Icon(Icons.Filled.Star, "Roll")
        }
        Text(text = "${state.value}", style = MaterialTheme.typography.displayLarge, modifier = Modifier.align(Alignment.Center))
    }

}

@Preview
@Composable
fun PreviewHomeScreen(){
    HomeContent(contentPadding = PaddingValues(0.dp), onPress = {}, state = HomeUIState(0))
}