package com.mahshookfoodway

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mahshookfoodway.ui.features.splash_screen.SplashScreen
import com.mahshookfoodway.ui.features.todo.TodoScreen
import com.mahshookfoodway.ui.theme.FoodWayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FoodWayTheme {
                // A surface container using the 'background' color from the theme
                FoodWayApp()
            }
        }
    }
}


@Composable
private fun FoodWayApp() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "SplashScreen") {
        composable(route = "SplashScreen") {
            SplashScreen {
                navController.popBackStack();
                navController.navigate("TodoScreen")
            }
        }
        composable(route = "TodoScreen") {
            TodoScreen {

            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FoodWayTheme {
        FoodWayApp()
    }
}