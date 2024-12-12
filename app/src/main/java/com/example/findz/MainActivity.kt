package com.example.findz

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import java.lang.reflect.Modifier

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ProfileScreen()
//            val navController = rememberNavController() // Membuat NavController
//            val sharedViewModel: SharedViewModel = viewModel() // Membuat instance SharedViewModel
//
//            // Mengatur Navigation Host
//            AppNavigation(navController = navController, sharedViewModel = sharedViewModel)
        }
    }
}
//
//@Composable
//fun AppNavigation(navController: NavHostController, sharedViewModel: SharedViewModel) {
//    NavHost(
//        navController = navController,
//        startDestination = "search_influencer"
//    ) {
//        composable("search_influencer") {
//            SearchInfluencerScreen(navController = navController, mainViewModel = sharedViewModel)
//        }
//
//        // Tambahkan layar lain jika ada
//        composable("home") {
//            HomeScreen(navController = navController)
//        }
//    }
//}