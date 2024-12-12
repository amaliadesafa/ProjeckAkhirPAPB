package com.example.findz

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    // Tampilan layar Home untuk navigasi
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center, // Konten diatur ke tengah layar
        horizontalAlignment = Alignment.CenterHorizontally // Konten rata tengah secara horizontal
    ) {
        Text(
            text = "Home Screen",
            style = MaterialTheme.typography.titleLarge // Menggunakan gaya teks dari MaterialTheme
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { navController.navigate("search_influencer") }) {
            Text(text = "Go to Search Influencer")
        }
    }
}
