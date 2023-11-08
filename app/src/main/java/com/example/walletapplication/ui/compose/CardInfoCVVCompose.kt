package com.example.walletapplication.ui.compose

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.AlertDialog
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.walletapplication.R
import com.example.walletapplication.ui.theme.backgroundCompose
import com.example.walletapplication.ui.theme.buttonCreateAccount
import com.example.walletapplication.ui.theme.buttonStart
import com.example.walletapplication.ui.theme.cardCVV
import com.example.walletapplication.ui.theme.checkBoxColor
import com.example.walletapplication.utils.TextFieldWallet

@Composable
fun CardCVVScreen(navController: NavController) {
    val cvvNumber = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }

    val context = LocalContext.current
    var showDialog by remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundCompose)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 40.dp)
                .height(768.dp)
                .align(Alignment.BottomCenter)
                .clip(shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp))
                .background(color = Color.White)
        ) {
            Column(
                modifier = Modifier.fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(
                    modifier = Modifier
                        .padding(top = 16.dp)
                        .width(40.dp)
                        .height(5.dp)
                        .clip(shape = RoundedCornerShape(100.dp))
                        .background(color = buttonCreateAccount)
                )
                Box(
                    modifier = Modifier
                        .padding(top = 19.dp)
                        .width(299.dp)
                        .height(189.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(
                            brush = Brush.horizontalGradient(
                                colors = listOf(
                                    Color(0xFF0E4DFB),
                                    Color(0xFF26DCFE),
                                ),
                            )
                        )
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Box(
                            modifier = Modifier
                                .padding(top = 23.dp)
                                .width(256.dp)
                                .height(38.dp)
                                .clip(shape = RoundedCornerShape(19.dp))
                                .background(color = cardCVV)
                        ) {
                            Text(
                                text = "Bank - 0850 724 0 890",
                                style = TextStyle(fontSize = 13.sp, color = Color.White),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }

                        Box(
                            modifier = Modifier
                                .padding(top = 60.dp, start = 16.dp)
                                .width(89.dp)
                                .height(38.dp)
                                .clip(shape = RoundedCornerShape(19.dp))
                                .background(color = Color.White)
                                .align(Alignment.Start)
                        ) {
                            Text(
                                text = "919",
                                style = TextStyle(
                                    fontSize = 13.sp,
                                    color = Color.Black,
                                    fontWeight = FontWeight.Bold
                                ),
                                modifier = Modifier.align(Alignment.Center)
                            )
                        }
                    }
                }

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    horizontalArrangement = Arrangement.Center
                ) {
                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                            .height(5.dp)
                            .clip(shape = RoundedCornerShape(2.5.dp))
                            .background(color = checkBoxColor)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Spacer(
                        modifier = Modifier
                            .width(16.dp)
                            .height(5.dp)
                            .clip(shape = RoundedCornerShape(2.5.dp))
                            .background(color = buttonStart)
                    )
                }

                Text(
                    text = "CVV Number",
                    style = TextStyle(fontSize = 14.sp, color = checkBoxColor),
                    modifier = Modifier
                        .padding(top = 32.dp, start = 35.dp)
                        .fillMaxWidth()
                )

                TextFieldWallet(
                    value = cvvNumber,
                    content = "919",
                    paddingTop = 17,
                    paddingBottom = 0,
                    paddingEnd = 35,
                    paddingStart = 0,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_card_number),
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_check),
                            contentDescription = null,
                            tint = buttonStart
                        )
                    },
                    keyboardType = KeyboardType.Number
                )

                if (showDialog) {
                    AlertDialog(
                        onDismissRequest = { showDialog = false },
                        text = {
                            CardAddedSuccessfullyScreen(navController = navController)
                        },
                        confirmButton = { })
                }

                Box(
                    modifier = Modifier
                        .clickable {
                            if (cvvNumber.value.text.isEmpty()) {
                                Toast
                                    .makeText(
                                        context,
                                        "you must to fill CVV Number",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            } else {
                                showDialog = true
                            }
                        }
                        .padding(top = 285.dp)
                        .width(305.dp)
                        .height(44.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                        .background(color = buttonStart)
                ) {
                    Text(
                        text = "NEXT",
                        style = TextStyle(fontSize = 16.sp, color = Color.White),
                        modifier = Modifier.align(
                            Alignment.Center
                        )
                    )
                }
            }
        }
    }
}

@Preview
@Composable
private fun SimpleComposablePreview() {
    val navController = rememberNavController()
    CardCVVScreen(navController = navController)
}
