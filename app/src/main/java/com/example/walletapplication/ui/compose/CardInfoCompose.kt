package com.example.walletapplication.ui.compose

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
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
import com.example.walletapplication.ui.theme.buttonStart
import com.example.walletapplication.ui.theme.buttonTrue
import com.example.walletapplication.ui.theme.checkBoxColor
import com.example.walletapplication.ui.theme.textContainer
import com.example.walletapplication.ui.theme.textLogin
import com.example.walletapplication.ui.theme.textLogin1
import com.example.walletapplication.ui.theme.textLogin2
import com.example.walletapplication.ui.theme.textSkip
import com.example.walletapplication.utils.TextFieldWallet

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CardIntoScreen(navController: NavController) {
    val cardNumber = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }

    val cardHolderName = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }
    val cardHolderMonth = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }
    val cardHolderYear = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }

    val checkedState = remember { mutableStateOf(false) }
    val context = LocalContext.current

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
                modifier = Modifier
                    .fillMaxSize()
                    .verticalScroll(rememberScrollState()),
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
                    Column(modifier = Modifier.fillMaxSize()) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 18.dp),
                            horizontalArrangement = Arrangement.Center,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.icon_hologram),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .clip(shape = RoundedCornerShape(5.dp))
                                    .background(color = Color.White)
                                    .width(47.dp)
                                    .height(38.dp)
                            )
                            Spacer(modifier = Modifier.width(154.dp))
                            Image(
                                painter = painterResource(id = R.drawable.icon_visa_logo),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(49.dp)
                                    .height(15.dp)
                            )
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 28.dp),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(46.dp)
                                    .height(45.dp)
                            ) {
                                Text(
                                    text = "***\n*",
                                    style = TextStyle(fontSize = 20.sp, color = Color.White)
                                )
                            }
                            Spacer(modifier = Modifier.width(19.dp))
                            Box(
                                modifier = Modifier
                                    .width(46.dp)
                                    .height(45.dp)
                            ) {
                                Text(
                                    text = "***\n*",
                                    style = TextStyle(fontSize = 20.sp, color = Color.White)
                                )
                            }
                            Spacer(modifier = Modifier.width(19.dp))
                            Box(
                                modifier = Modifier
                                    .width(46.dp)
                                    .height(45.dp)
                            ) {
                                Text(
                                    text = "***\n*",
                                    style = TextStyle(fontSize = 20.sp, color = Color.White)
                                )
                            }
                            Spacer(modifier = Modifier.width(19.dp))
                            Box(
                                modifier = Modifier
                                    .width(46.dp)
                                    .height(45.dp)
                            ) {
                                Text(
                                    text = "***\n*",
                                    style = TextStyle(fontSize = 20.sp, color = Color.White)
                                )
                            }
                        }

                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.Center
                        ) {
                            Box(
                                modifier = Modifier
                                    .width(62.dp)
                                    .height(26.dp)
                            ) {
                                Column(Modifier.fillMaxSize()) {
                                    Text(
                                        text = "CARD",
                                        style = TextStyle(fontSize = 7.sp, color = textContainer)
                                    )
                                    Text(
                                        text = "XX",
                                        style = TextStyle(fontSize = 13.sp, color = Color.White)
                                    )
                                }
                            }
                            Spacer(modifier = Modifier.width(127.dp))
                            Box(
                                modifier = Modifier
                                    .width(62.dp)
                                    .height(26.dp)
                            ) {
                                Column(Modifier.fillMaxSize()) {
                                    Text(
                                        text = "EXPIRES",
                                        style = TextStyle(fontSize = 7.sp, color = textContainer)
                                    )
                                    Text(
                                        text = "09/2\n2",
                                        style = TextStyle(fontSize = 13.sp, color = Color.White)
                                    )
                                }
                            }

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
                            .width(16.dp)
                            .height(5.dp)
                            .clip(shape = RoundedCornerShape(2.5.dp))
                            .background(color = buttonStart)
                    )
                    Spacer(modifier = Modifier.width(8.dp))
                    Spacer(
                        modifier = Modifier
                            .width(8.dp)
                            .height(5.dp)
                            .clip(shape = RoundedCornerShape(2.5.dp))
                            .background(color = checkBoxColor)
                    )
                }

                Text(
                    text = "Card Number",
                    style = TextStyle(fontSize = 14.sp, color = checkBoxColor),
                    modifier = Modifier
                        .padding(top = 32.dp, start = 35.dp)
                        .fillMaxWidth()
                )

                TextFieldWallet(
                    value = cardNumber,
                    content = "0000 0000 0000 0000",
                    paddingTop = 17,
                    paddingBottom = 0,
                    paddingEnd = 0,
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

                Text(
                    text = "Cardholder Name",
                    style = TextStyle(fontSize = 14.sp, color = checkBoxColor),
                    modifier = Modifier
                        .padding(top = 12.dp, start = 35.dp)
                        .fillMaxWidth()
                )

                TextFieldWallet(
                    value = cardHolderName,
                    content = "Uğur Ateş",
                    paddingTop = 17,
                    paddingBottom = 0,
                    paddingEnd = 0,
                    paddingStart = 0,
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_user),
                            contentDescription = null,
                            tint = textSkip
                        )
                    },
                    trailingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.icon_check),
                            contentDescription = null,
                            tint = buttonStart
                        )
                    },
                    keyboardType = KeyboardType.Text
                )

                Box(
                    modifier = Modifier
                        .width(305.dp)
                        .padding(top = 16.dp)
                ) {
                    Row(horizontalArrangement = Arrangement.Center) {
                        Column(modifier = Modifier.weight(1f)) {
                            Text(text = "Month", fontSize = 14.sp, color = checkBoxColor)
                            TextField(
                                value = cardHolderMonth.value,
                                placeholder = {
                                    Text(
                                        text = "20",
                                        style = TextStyle(fontSize = 14.sp, color = textLogin)
                                    )
                                },
                                leadingIcon = {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_month),
                                        contentDescription = null
                                    )
                                },
                                onValueChange = { cardHolderMonth.value = it },
                                keyboardOptions = KeyboardOptions.Default.copy(
                                    keyboardType = KeyboardType.Number,
                                ),
                                colors = TextFieldDefaults.textFieldColors(
                                    unfocusedIndicatorColor = buttonCreateAccount,
                                    focusedIndicatorColor = buttonCreateAccount,
                                    containerColor = buttonCreateAccount,
                                    textColor = Color.Black
                                ),
                                modifier = Modifier
                                    .width(145.dp)
                                    .padding(top = 17.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                                    .background(color = buttonCreateAccount)
                            )
                        }
                        Column(modifier = Modifier.weight(1f)) {
                            Text(text = "Year", fontSize = 14.sp, color = checkBoxColor)
                            TextField(
                                value = cardHolderYear.value,
                                placeholder = {
                                    Text(
                                        text = "2023",
                                        style = TextStyle(fontSize = 14.sp, color = textLogin)
                                    )
                                },
                                leadingIcon = {
                                    Icon(
                                        painter = painterResource(id = R.drawable.ic_month),
                                        contentDescription = null
                                    )
                                },
                                onValueChange = { cardHolderYear.value = it },
                                keyboardOptions = KeyboardOptions.Default.copy(
                                    keyboardType = KeyboardType.Number,
                                ),
                                colors = TextFieldDefaults.textFieldColors(
                                    unfocusedIndicatorColor = buttonCreateAccount,
                                    focusedIndicatorColor = buttonCreateAccount,
                                    containerColor = buttonCreateAccount,
                                    textColor = Color.Black
                                ),
                                modifier = Modifier
                                    .width(145.dp)
                                    .padding(top = 17.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                                    .background(color = buttonCreateAccount)
                            )
                        }
                    }
                }

                Row(
                    modifier = Modifier
                        .padding(top = 24.dp)
                        .width(305.dp)
                        .height(40.dp),
                ) {
                    Column(
                        modifier = Modifier.fillMaxHeight(),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Checkbox(
                            checked = checkedState.value,
                            onCheckedChange = {
                                checkedState.value = it
                            },
                            colors = CheckboxDefaults.colors(checkedColor = buttonTrue),
                            modifier = Modifier
                                .width(20.dp)
                                .height(20.dp)
                        )
                    }
//                    Box(modifier = Modifier.align(Alignment.Bottom)) {
//                        Checkbox(
//                            checked = checkedState.value,
//                            onCheckedChange = {
//                                checkedState.value = it
//                            },
//                            colors = CheckboxDefaults.colors(checkedColor = buttonTrue),
//                            modifier = Modifier.align(Alignment.BottomStart)
//                        )
//                    }
                    Spacer(modifier = Modifier.width(30.dp))
                    Column(
                        modifier = Modifier
                            .width(265.dp)
                            .height(40.dp),
                        verticalArrangement = Arrangement.Bottom
                    ) {
                        Text(
                            text = "Remember this card details.",
                            style = TextStyle(fontSize = 12.sp, color = textLogin2),
                            textAlign = TextAlign.Start
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .clickable {
                            if (cardNumber.value.text.isEmpty() ||
                                cardHolderName.value.text.isEmpty() ||
                                cardHolderMonth.value.text.isEmpty() ||
                                cardHolderYear.value.text.isEmpty()
                            ) {
                                Toast
                                    .makeText(
                                        context,
                                        "you must to fill all values",
                                        Toast.LENGTH_SHORT
                                    )
                                    .show()
                            } else {
                                navController.navigate("CardCVV")
                            }
                        }
                        .padding(top = 98.dp, bottom = 40.dp)
                        .width(305.dp)
                        .height(44.dp)
                        .clip(shape = RoundedCornerShape(15.dp))
                        .background(
                            color = if (cardNumber.value.text.isEmpty() ||
                                cardHolderName.value.text.isEmpty() ||
                                cardHolderMonth.value.text.isEmpty() ||
                                cardHolderYear.value.text.isEmpty()
                            ) {
                                buttonFalse
                            } else {
                                buttonStart
                            }
                        )
                ) {
                    Text(
                        text = "NEXT",
                        style = TextStyle(
                            fontSize = 16.sp,
                            color = if (cardNumber.value.text.isEmpty() ||
                                cardHolderName.value.text.isEmpty() ||
                                cardHolderMonth.value.text.isEmpty() ||
                                cardHolderYear.value.text.isEmpty()) textLogin1 else Color.White
                        ),
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
private fun WalletComposablePreview() {
    val navController = rememberNavController()
    CardIntoScreen(navController = navController)
}