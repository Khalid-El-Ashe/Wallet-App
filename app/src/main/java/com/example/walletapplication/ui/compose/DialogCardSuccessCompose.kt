package com.example.walletapplication.ui.compose

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
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.walletapplication.R
import com.example.walletapplication.ui.theme.buttonTrue
import com.example.walletapplication.ui.theme.textLogin
import com.example.walletapplication.ui.theme.textLogin1

@Composable
fun CardAddedSuccessfullyScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .width(305.dp)
            .height(200.dp)
            .clip(shape = RoundedCornerShape(15.dp))
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Card Added Successfully",
                style = TextStyle(fontSize = 16.sp, color = textLogin),
                modifier = Modifier.padding(top = 72.dp)
            )
            Text(
                text = "Now you can freely pay and shop, enjoy it \uD83E\uDD18",
                style = TextStyle(fontSize = 12.sp, color = textLogin1),
                modifier = Modifier.padding(top = 7.dp)
            )
            Text(
                text = "Click & Continue",
                style = TextStyle(fontSize = 12.sp, color = buttonTrue),
                modifier = Modifier
                    .padding(top = 33.dp)
                    .clickable {
                        navController.navigate("Home")
                    }
            )
        }
    }
}

@Preview
@Composable
private fun SimpleComposablePreview() {
    val navController = rememberNavController()
    CardAddedSuccessfullyScreen(navController = navController)
}
