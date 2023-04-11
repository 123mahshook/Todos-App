package com.mahshookfoodway.ui.features.splash_screen

import android.window.SplashScreen
import androidx.compose.foundation.layout.*
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mahshookfoodway.ui.utils.AppColors
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navigationCallBack: () -> Unit) {
    LaunchedEffect(Unit){
        delay(2000)
        navigationCallBack.invoke()
    }
    Scaffold(modifier = Modifier.fillMaxSize(),
        backgroundColor = AppColors().white,
        content = { paddingValues ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(paddingValues),
               // verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(modifier = Modifier.weight(1.0f))
                Text(
                    text = "Todos",
                    style = TextStyle(
                        fontSize = 22.sp,
                        color = AppColors().black,
                        fontWeight = FontWeight.Bold
                    )
                )
                Spacer(modifier = Modifier.weight(1.0f))
            }

        }
    )
}

/*
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FoodParkTheme {
        SplashScreen({})
    }
}
 */