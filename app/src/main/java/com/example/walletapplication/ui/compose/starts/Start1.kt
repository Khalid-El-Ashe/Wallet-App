package com.example.walletapplication.ui.compose.starts

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.walletapplication.R
import com.example.walletapplication.ui.theme.backgroundBox
import com.example.walletapplication.ui.theme.buttonStart
import com.example.walletapplication.ui.theme.text1Color

@Composable
fun StartOneScreen(navController: NavController) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.image1),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(color = backgroundBox)
        )
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.group_97),
                contentDescription = null,
                Modifier.padding(top = 81.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.group_100), contentDescription = null,
                Modifier
                    .padding(top = 100.dp)
                    .width(85.dp)
                    .height(59.dp)
            )
            Text(
                text = "Leading Payment \nApplication",
                style = TextStyle(fontSize = 24.sp, color = text1Color),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 15.dp)
            )
            Text(
                text = "More than 100 million users with 1,000 thousand \n partners and services in the world",
                style = TextStyle(
                    fontSize = 12.sp,
                    color = Color.White,
                    fontStyle = FontStyle.Normal
                ),
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 12.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.indicator1),
                contentDescription = null,
                modifier = Modifier.padding(top = 40.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.group_13),
                contentDescription = null,
                modifier = Modifier
                    .padding(top = 62.dp)
                    .width(61.dp)
                    .height(61.dp)
            )

            Box(
                modifier = Modifier
                    .padding(top = 27.dp)
                    .width(305.dp)
                    .height(44.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(color = buttonStart)
                    .clickable {
                        navController.navigate("Start2") {
                            navController.popBackStack()
                        }
                    }
            ) {
                Text(
                    text = "GET STARTED",
                    style = TextStyle(fontSize = 16.sp, color = Color.White),
                    modifier = Modifier.align(
                        Alignment.Center
                    )
                )
            }
        }
    }
}

//@Preview
//@Composable
//fun WalletComposablePreview() {
//    val navController = rememberNavController()
//    StartOneScreen(navController)
//}