package com.example.walletapplication.ui.compose.loingAndRegister

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.walletapplication.R
import com.example.walletapplication.ui.theme.backgroundCompose
import com.example.walletapplication.ui.theme.buttonCreateAccount
import com.example.walletapplication.ui.theme.buttonFalse
import com.example.walletapplication.ui.theme.buttonTrue
import com.example.walletapplication.ui.theme.textLogin
import com.example.walletapplication.ui.theme.textLogin1
import com.example.walletapplication.ui.theme.textLogin2
import com.example.walletapplication.utils.TextFieldWallet

@Composable
fun LoginScreen(navController: NavController) {

    var phoneNumberValue = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }

    var passwordValue = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }

    val context = LocalContext.current

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
            Spacer(Modifier.width(90.dp))
            Text(
                text = "Forgot your credentials?",
                style = TextStyle(fontSize = 14.sp), textAlign = TextAlign.End,
                modifier = Modifier.weight(1f)
            )
        }

        Box(
            modifier = Modifier
                .height(656.dp)
                .align(Alignment.BottomCenter)
                .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(color = Color.White)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "Let’s Sign You In",
                    style = TextStyle(
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Normal,
                        color = textLogin
                    ),
                    modifier = Modifier
                        .padding(top = 96.dp)
                )

                Text(
                    text = "Welcome back, you’ve been missed!",
                    style = TextStyle(fontSize = 14.sp, color = textLogin1),
                    modifier = Modifier.padding(top = 8.dp)
                )

                Text(
                    text = "Phone Number",
                    style = TextStyle(fontSize = 14.sp, color = textLogin2),
                    modifier = Modifier
                        .width(305.dp)
                        .padding(top = 52.dp)
                )

                TextFieldWallet(
                    value = phoneNumberValue,
                    content = "(+84) 123 456 789",
                    paddingTop = 17,
                    paddingBottom = 0,
                    paddingEnd = 0,
                    paddingStart = 0,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_mobile),
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        null
                    },
                    keyboardType = KeyboardType.Phone
                )

                Text(
                    text = "Password",
                    style = TextStyle(fontSize = 14.sp, color = textLogin2),
                    modifier = Modifier
                        .width(305.dp)
                        .padding(top = 12.dp)
                )

                TextFieldWallet(
                    value = passwordValue,
                    content = "• • • • • • • • • • • • •",
                    paddingTop = 17,
                    paddingBottom = 0,
                    paddingEnd = 0,
                    paddingStart = 0,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_lock),
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        null
                    },
                    keyboardType = KeyboardType.Password
                )

                Button(
                    onClick = {
                        if (phoneNumberValue.value.text.isEmpty() || passwordValue.value.text.isEmpty()) {
                            Toast.makeText(context, "you must to fill data", Toast.LENGTH_SHORT)
                                .show()
                        } else if (passwordValue.value.text.length < 6) {
                            Toast.makeText(context, "the password is to short", Toast.LENGTH_SHORT)
                                .show()
                        } else {
                            navController.navigate("ChoiceCard") {
                                // i do not need back to this page
                                navController.popBackStack()
                            }
                            Toast.makeText(context, "success", Toast.LENGTH_SHORT)
                                .show()
                        }
                    },
                    colors = ButtonDefaults.buttonColors(
                        containerColor =
                        if (phoneNumberValue.value.text.isEmpty() || passwordValue.value.text.isEmpty()) buttonFalse else buttonTrue
                    ),
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .padding(top = 134.dp)
                        .width(305.dp)
                        .height(44.dp)
                ) {
                    Text(
                        text = "Sign In",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = if (phoneNumberValue.value.text.isEmpty() || passwordValue.value.text.isEmpty()) textLogin1 else Color.White
                        )
                    )
                }

                Button(
                    onClick = {
                        navController.navigate("Register")
                    },
                    colors = ButtonDefaults.buttonColors(containerColor = buttonCreateAccount),
                    shape = RoundedCornerShape(15.dp),
                    modifier = Modifier
                        .padding(top = 8.dp)
                        .width(305.dp)
                        .height(44.dp)
                ) {
                    Text(
                        text = "Create an account",
                        style = TextStyle(
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = Color.Black
                        )
                    )
                }

            }
        }

        Image(
            painter = painterResource(id = R.drawable.icon_photo_user),
            contentDescription = null,
            modifier = Modifier
                .padding(top = 116.dp)
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
private fun WalletComposablePreview() {
    val navController = rememberNavController()
    LoginScreen(navController = navController)
}