package com.example.walletapplication.ui.compose

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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.walletapplication.R
import com.example.walletapplication.ui.compose.loingAndRegister.RegisterScreen
import com.example.walletapplication.ui.theme.backgroundCompose
import com.example.walletapplication.ui.theme.buttonCreateAccount
import com.example.walletapplication.ui.theme.textLogin
import com.example.walletapplication.ui.theme.textSkip

@Composable
fun ChoiceCardScreen(navController: NavController) {

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = backgroundCompose)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 60.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.icon_left),
                    contentDescription = null,
                    modifier = Modifier.clickable {

                    }
                )
                Spacer(modifier = Modifier.width(26.dp))
                Text(
                    text = "Link Card",
                    style = TextStyle(
                        fontSize = 16.sp,
                        fontWeight = FontWeight.Normal,
                        color = textLogin,
                        textAlign = TextAlign.Center
                    ),
                    modifier = Modifier.width(205.dp)
                )
                Spacer(modifier = Modifier.width(26.dp))
                Text(
                    text = "Skip",
                    style = TextStyle(
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Normal,
                        color = textSkip
                    ),
                    modifier = Modifier.clickable {
                        navController.navigate("CardInfo")
                    }
                )
            }

            Box(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .width(345.dp)
                    .height(386.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(color = Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Bank Account",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            color = textLogin
                        ),
                        modifier = Modifier
                            .width(305.dp)
                            .padding(top = 20.dp)
                    )

                    Spacer(
                        modifier = Modifier
                            .padding(top = 24.dp)
                            .width(305.dp)
                            .height(1.dp)
                            .background(color = buttonCreateAccount)
                    )

                    Row(
                        modifier = Modifier
                            .padding(top = 49.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.hsbc),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "HSBC",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.citibank),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Citibank",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.bank),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Bank of A…",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.deutsche),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Deutsche",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                    }

                    Row(
                        modifier = Modifier
                            .padding(top = 15.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.mizuho),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Mizuho",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.santander),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Santander",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.mufg),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "MUFG",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.barclays),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Barclays",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                    }

                    Box(
                        modifier = Modifier
                            .padding(top = 24.dp)
                            .width(305.dp)
                            .height(44.dp)
                            .clip(shape = RoundedCornerShape(15.dp))
                            .background(color = buttonCreateAccount)
                    ) {
                        Text(
                            text = "See all",
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Normal,
                            color = textLogin,
                            textAlign = TextAlign.Center,
                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.Center)
                        )
                    }
                }
            }
            Box(
                modifier = Modifier
                    .padding(top = 15.dp)
                    .width(345.dp)
                    .height(206.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(color = Color.White)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "International Card",
                        style = TextStyle(
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Normal,
                            color = textLogin
                        ),
                        modifier = Modifier
                            .width(305.dp)
                            .padding(top = 20.dp)
                    )

                    Spacer(
                        modifier = Modifier
                            .padding(top = 24.dp)
                            .width(305.dp)
                            .height(1.dp)
                            .background(color = buttonCreateAccount)
                    )

                    Row(
                        modifier = Modifier
                            .padding(top = 24.dp)
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.Center
                    ) {
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.paypal),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Paypal",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.visa),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Visa",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.mastercard),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Mastercard",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                        Spacer(modifier = Modifier.width(15.dp))
                        Column {
                            Image(
                                painter = painterResource(id = R.drawable.payoneer),
                                contentDescription = null,
                                modifier = Modifier
                                    .width(65.dp)
                                    .height(65.dp)
                            )
                            Text(
                                text = "Payoneer",
                                style = TextStyle(
                                    fontWeight = FontWeight.Normal,
                                    fontSize = 12.sp,
                                    color = textLogin,
                                    textAlign = TextAlign.Center,
                                ),
                                modifier = Modifier
                                    .padding(top = 8.dp)
                                    .width(65.dp)
                            )
                        }
                    }
                }
            }
        }
    }
}
