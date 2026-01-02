package com.example.myfirebase.view.controllNavigasi

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Suppress("unused")
@Composable
fun DataSiswaApp(modifier: Modifier = Modifier, navController: NavHostController = rememberNavController()) {
    HostNavigasi(navController = navController, modifier = modifier)
}
