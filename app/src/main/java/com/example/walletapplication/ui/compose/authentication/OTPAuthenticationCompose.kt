package com.example.walletapplication.ui.compose.authentication

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.walletapplication.R
import com.example.walletapplication.ui.theme.backgroundCompose
import com.example.walletapplication.ui.theme.buttonStart
import com.example.walletapplication.ui.theme.buttonTrue
import com.example.walletapplication.ui.theme.textLogin
import com.example.walletapplication.ui.theme.textLogin1
import com.example.walletapplication.ui.theme.textLogin2
import com.example.walletapplication.utils.TextFieldOTP

@Composable
fun OTPScreen() {
    val code1 = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }
    val code2 = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }
    val code3 = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }
    val code4 = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }
    var isFill = false

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
                    text = "OTP Authentication",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                        color = textLogin
                    ),
                    modifier = Modifier
                        .padding(top = 96.dp)
                )

                Text(
                    text = "An authentication code has been sent to\n(+84) 999 999 999",
                    style = TextStyle(fontSize = 14.sp, color = textLogin1),
                    modifier = Modifier.padding(top = 8.dp),
                    textAlign = TextAlign.Center
                )


                Box(
                    modifier = Modifier
                        .width(305.dp)
                        .height(105.dp)
                        .padding(top = 48.dp)
                ) {

                    Row(
                        modifier = Modifier.fillMaxSize(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        TextFieldOTP(
                            value = code1,
                            content = "4",
                            enabled = false,
                            padding = 0,
                            leadingIcon = { },
                            trailingIcon = { },
                            keyboardType = KeyboardType.Number
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        TextFieldOTP(
                            value = code2,
                            content = "",
                            enabled = false,
                            padding = 0,
                            leadingIcon = { },
                            trailingIcon = { },
                            keyboardType = KeyboardType.Number
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        TextFieldOTP(
                            value = code3,
                            content = "",
                            enabled = false,
                            padding = 0,
                            leadingIcon = { },
                            trailingIcon = { },
                            keyboardType = KeyboardType.Number
                        )
                        Spacer(modifier = Modifier.width(15.dp))
                        TextFieldOTP(
                            value = code4,
                            content = "",
                            enabled = false,
                            padding = 0,
                            leadingIcon = { },
                            trailingIcon = { },
                            keyboardType = KeyboardType.Number
                        )
                    }

                }

                Row(
                    modifier = Modifier
                        .width(305.dp)
                        .padding(top = 24.dp), horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "I didn’t receive code.",
                        style = TextStyle(fontSize = 12.sp, color = textLogin2)
                    )
                    Text(
                        text = " Resend Code",
                        style = TextStyle(fontSize = 12.sp, color = buttonStart)
                    )
                }

                Button(
                    onClick = { },
                    colors = ButtonDefaults.buttonColors(containerColor = buttonTrue),
                    shape = RoundedCornerShape(15),
                    modifier = Modifier
                        .padding(top = 169.dp)
                        .width(305.dp)
                        .height(44.dp)
                ) {
                    Text(
                        text = "NEXT",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.White
                        )
                    )
                }

                Text(
                    text = "By Signing up, you agree to our",
                    style = TextStyle(fontSize = 12.sp, color = textLogin2),
                    modifier = Modifier.padding(top = 16.dp)
                )
                Text(
                    text = "Term and Conditions",
                    style = TextStyle(fontSize = 12.sp, color = buttonStart),
                )
            }
        }

        Image(
            painter = painterResource(id = R.drawable.icon_photo_user),
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
@Preview
@Composable
private fun SimpleComposablePreview() {
    OTPScreen()
}