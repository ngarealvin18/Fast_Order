package com.alvin.fastorder.ui.theme.Screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.alvin.fastorder.navigation.ROUTE_PRODUCT



@Composable
fun HomeScreen(navController: NavController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Text(text = "WELCOME TO",
            color = Color.Magenta,
            fontFamily = FontFamily.Cursive,
            fontSize = 50.sp
        )
        Spacer(modifier =Modifier.height(20.dp))
        Text(text = "FAST ORDER",
            color = Color.Magenta,
            fontFamily = FontFamily.Cursive,
            fontSize = 40.sp
        )
        Spacer(modifier =Modifier.height(400.dp))

        Button(onClick ={
            navController.navigate(ROUTE_PRODUCT)
        },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text ="GET STARTED",
                color=Color.DarkGray)


        }

    }
}
@Preview
@Composable
fun HomeScreenPrev() {
    HomeScreen(rememberNavController())
}