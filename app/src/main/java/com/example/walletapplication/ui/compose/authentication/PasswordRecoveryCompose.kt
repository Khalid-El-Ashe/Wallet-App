package com.example.walletapplication.ui.compose.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.walletapplication.R
import com.example.walletapplication.ui.theme.backgroundCompose
import com.example.walletapplication.ui.theme.buttonCreateAccount
import com.example.walletapplication.ui.theme.buttonTrue
import com.example.walletapplication.ui.theme.checkBoxColor
import com.example.walletapplication.ui.theme.textLogin
import com.example.walletapplication.ui.theme.textLogin1

@Composable
fun PasswordRecoveryScreen() {
    var value by remember { mutableStateOf(0) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundCompose)
    ) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(top = 56.dp, start = 35.dp, end = 35.dp)
        ) {
            Icon(
                painter = painterResource(id = R.drawable.icon_close),
                contentDescription = null,
            )
        }

        Box(
            modifier = Modifier
                .padding(top = 156.dp)
                .fillMaxSize()
                .align(Alignment.BottomCenter)
                .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(color = Color.White)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Password Recovery",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                        color = textLogin
                    ),
                    modifier = Modifier
                        .padding(top = 96.dp)
                )

                Text(
                    text = "Enter your Phone number to recover your password",
                    style = TextStyle(fontSize = 14.sp, color = textLogin1),
                    modifier = Modifier.padding(top = 8.dp),
                    textAlign = TextAlign.Center
                )

                Box(
                    modifier = Modifier
                        .padding(top = 48.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                        .width(305.dp)
                        .height(78.dp)
                        .background(color = buttonCreateAccount)
                ) {
                    Column(modifier = Modifier.fillMaxSize()) {
                        Text(
                            text = "Phone Number",
                            style = TextStyle(fontSize = 14.sp, color = checkBoxColor),
                            modifier = Modifier.padding(top = 8.dp, start = 16.dp)
                        )
//                        SpinnerFieldRecovery()
                    }
                }

                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = buttonTrue),
                    shape = RoundedCornerShape(15),
                    modifier = Modifier
                        .padding(top = 196.dp)
                        .width(305.dp)
                        .height(44.dp)
                ) {
                    Text(
                        text = "SEND CODE",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    )
                }
            }
        }

        Image(
            painter = painterResource(id = R.drawable.icon_recovery),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 120.dp)
                .width(80.dp)
                .height(80.dp)
                .clip(CircleShape)
                .border(6.dp, Color.White, CircleShape)
                .align(Alignment.TopCenter)
        )

    }
}
