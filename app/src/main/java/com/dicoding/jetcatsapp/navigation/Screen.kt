package com.dicoding.jetcatsapp.navigation

sealed class Screen(val route: String) {
    object Splash : Screen("splash_screen")
    object Home : Screen("home_screen")
    object Profile : Screen("profile_screen")
    object Detail : Screen("detail_screen")
}