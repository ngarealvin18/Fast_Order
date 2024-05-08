package com.alvin.fastorder.ui.theme.Screens.Products

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
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.alvin.fastorder.navigation.ROUTE_PRODUCT
import com.alvin.fastorder.ui.theme.Screens.home.HomeScreen

@Composable
fun ProductScreen(navController: NavHostController) {
    Column (horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ){
        Text(text = "WELCOME TO",
            color = Color.Magenta,
            fontFamily = FontFamily.Monospace,
            fontSize = 50.sp
        )
        Text(text = "FAST ORDER",
            color = Color.Magenta,
            fontFamily = FontFamily.Monospace,
            fontSize = 40.sp
        )
        Spacer(modifier = Modifier.height(400.dp))

        Button(onClick ={
            navController.navigate(ROUTE_PRODUCT)
        },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text(text ="GET STARTED",
                color= Color.DarkGray)


        }

    }
}

@Preview
@Composable
fun ProductScreenPrev() {
    ProductScreen(rememberNavController())
}