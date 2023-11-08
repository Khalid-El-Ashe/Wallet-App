package com.example.walletapplication.ui.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.walletapplication.R
import com.example.walletapplication.ui.theme.background
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = background)

    ) {
        Image(
            painter = painterResource(id = R.drawable.splash_image),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .graphicsLayer(
                    scaleX = 1.80f,
                    scaleY = 1.80f,
                    translationX = (150).dp.value,
                    translationY = (-300).dp.value
                )
        )

        Image(
            painter = painterResource(id = R.drawable.icon_app),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .align(
                    Alignment.Center
                )
                .fillMaxWidth()
                .padding(top = 300.dp)
        )
    }

    LaunchedEffect(Unit) {
        delay(3000)
        navController.navigate("Start1") {
            navController.popBackStack()
        }
    }
}