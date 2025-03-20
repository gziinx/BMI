package br.senai.sp.jandira.bmi

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.bmi.screens.HomeScreen
import br.senai.sp.jandira.bmi.screens.UserDataScreen
import br.senai.sp.jandira.bmi.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BMITheme {
               var navegacao = rememberNavController()
                NavHost(
                    navController = navegacao,
                    startDestination = "home"
                ){
                    composable(route = "home"){ HomeScreen(navegacao)}
                    composable(route = "dados"){ UserDataScreen() }
                }
            }
            }
        }
    }
