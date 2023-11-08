package com.example.walletapplication.ui.compose

import android.annotation.SuppressLint
import android.widget.Toast
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
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
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
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.walletapplication.R
import com.example.walletapplication.ui.theme.backgroundCompose
import com.example.walletapplication.ui.theme.box1
import com.example.walletapplication.ui.theme.box2
import com.example.walletapplication.ui.theme.box3
import com.example.walletapplication.ui.theme.box4
import com.example.walletapplication.ui.theme.box5
import com.example.walletapplication.ui.theme.box8
import com.example.walletapplication.ui.theme.buttonCreateAccount
import com.example.walletapplication.ui.theme.date_color
import com.example.walletapplication.ui.theme.line
import com.example.walletapplication.ui.theme.textLogin1
import com.example.walletapplication.ui.theme.textSkip
import com.example.walletapplication.ui.theme.tint_more
import com.example.walletapplication.ui.theme.title_color
import com.example.walletapplication.ui.theme.total_minus_color
import com.example.walletapplication.ui.theme.total_plus_color
import com.example.walletapplication.ui.theme.user_color
import com.example.walletapplication.utils.AllPages

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {
    val text_search = remember { // this function to update the input type
        mutableStateOf(TextFieldValue("")) // to refresh to view
    }
    val context = LocalContext.current
    val navs = listOf(AllPages.Home, AllPages.CardInfo, AllPages.Profile)

    Scaffold(
        content = {
            Box(
                modifier = Modifier
                    .background(color = backgroundCompose)
            ) {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TextField(
                        value = text_search.value,
                        onValueChange = { text_search.value = it },
                        placeholder = {
                            Text(
                                text = "Search on CaPay",
                                style = TextStyle(
                                    fontSize = 17.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = textLogin1
                                )
                            )
                        },
                        leadingIcon = {
                            Icon(
                                painter = painterResource(id = R.drawable.ic_search),
                                contentDescription = null
                            )
                        },
                        colors = TextFieldDefaults.textFieldColors(
                            unfocusedIndicatorColor = Color.White,
                            focusedIndicatorColor = Color.White,
                            containerColor = Color.White,
                            textColor = Color.Black
                        ),
                        modifier = Modifier
                            .padding(top = 25.dp)
                            .clip(shape = RoundedCornerShape(15.dp)),
                    )

                    Text(
                        text = "$ 16,003.00",
                        style = TextStyle(fontSize = 20.sp),
                        modifier = Modifier.padding(top = 20.dp)
                    )
                    Text(
                        text = "CaPay Balance",
                        style = TextStyle(fontSize = 13.sp, color = textLogin1),
                        modifier = Modifier.padding(top = 7.dp)
                    )

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 20.dp), horizontalArrangement = Arrangement.Center
                    ) {
                        Box(
                            modifier = Modifier
                                .width(100.dp)
                                .height(70.dp)
                                .clip(shape = RoundedCornerShape(15.dp))
                                .background(color = Color.White)
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Top up",
                                    style = TextStyle(fontSize = 16.sp, color = textSkip)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(5.dp))
                        Box(
                            modifier = Modifier
                                .width(100.dp)
                                .height(70.dp)
                                .clip(shape = RoundedCornerShape(15.dp))
                                .background(color = Color.White)
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Transfer",
                                    style = TextStyle(fontSize = 16.sp, color = textSkip)
                                )
                            }
                        }
                        Spacer(modifier = Modifier.width(5.dp))
                        Box(
                            modifier = Modifier
                                .width(100.dp)
                                .height(70.dp)
                                .clip(shape = RoundedCornerShape(15.dp))
                                .background(color = Color.White)
                        ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = "Withdraw",
                                    style = TextStyle(fontSize = 16.sp, color = textSkip)
                                )
                            }
                        }
                    }

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(top = 30.dp, bottom = 80.dp)
                            .weight(2f)
                            .clip(shape = RoundedCornerShape(topEnd = 30.dp, topStart = 30.dp))
                            .background(color = Color.White)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .verticalScroll(rememberScrollState()),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Box(modifier = Modifier.fillMaxWidth()) {
                                Text(
                                    text = "Services",
                                    style = TextStyle(fontSize = 18.sp, color = textSkip),
                                    modifier = Modifier.padding(top = 20.dp, start = 30.dp)
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(top = 25.dp),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(60.dp)
                                            .height(60.dp)
                                            .clip(shape = RoundedCornerShape(15.dp))
                                            .background(color = box1)
                                            .clickable {
                                                Toast
                                                    .makeText(
                                                        context,
                                                        "Traveling",
                                                        Toast.LENGTH_SHORT
                                                    )
                                                    .show()
                                            }
                                    )
                                    Text(
                                        text = "Traveling",
                                        style = TextStyle(fontSize = 15.sp, color = textSkip),
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(20.dp))
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(60.dp)
                                            .height(60.dp)
                                            .clip(shape = RoundedCornerShape(15.dp))
                                            .background(color = box2)
                                            .clickable {
                                                Toast
                                                    .makeText(context, "Ticket", Toast.LENGTH_SHORT)
                                                    .show()
                                            }
                                    )
                                    Text(
                                        text = "Ticket",
                                        style = TextStyle(fontSize = 15.sp, color = textSkip),
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.width(20.dp))
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(60.dp)
                                            .height(60.dp)
                                            .clip(shape = RoundedCornerShape(15.dp))
                                            .background(color = box3)
                                            .clickable {
                                                Toast
                                                    .makeText(
                                                        context,
                                                        "Shopping",
                                                        Toast.LENGTH_SHORT
                                                    )
                                                    .show()
                                            }
                                    )
                                    Text(
                                        text = "Shopping",
                                        style = TextStyle(fontSize = 15.sp, color = textSkip),
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.width(20.dp))
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(60.dp)
                                            .height(60.dp)
                                            .clip(shape = RoundedCornerShape(15.dp))
                                            .background(color = box4)
                                            .clickable {
                                                Toast
                                                    .makeText(
                                                        context,
                                                        "Voucher",
                                                        Toast.LENGTH_SHORT
                                                    )
                                                    .show()
                                            }
                                    )
                                    Text(
                                        text = "Voucher",
                                        style = TextStyle(fontSize = 15.sp, color = textSkip),
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(top = 25.dp),
                                horizontalArrangement = Arrangement.Center
                            ) {
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(60.dp)
                                            .height(60.dp)
                                            .clip(shape = RoundedCornerShape(15.dp))
                                            .background(color = box5)
                                            .clickable {
                                                Toast
                                                    .makeText(context, "Top up", Toast.LENGTH_SHORT)
                                                    .show()
                                            }
                                    )
                                    Text(
                                        text = "Top Up",
                                        style = TextStyle(fontSize = 15.sp, color = textSkip),
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                                Spacer(modifier = Modifier.width(20.dp))
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(60.dp)
                                            .height(60.dp)
                                            .clip(shape = RoundedCornerShape(15.dp))
                                            .background(color = box4)
                                            .clickable {
                                                Toast
                                                    .makeText(
                                                        context,
                                                        "Bill Pay",
                                                        Toast.LENGTH_SHORT
                                                    )
                                                    .show()
                                            }
                                    )
                                    Text(
                                        text = "Bill Pay",
                                        style = TextStyle(fontSize = 15.sp, color = textSkip),
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.width(20.dp))
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(60.dp)
                                            .height(60.dp)
                                            .clip(shape = RoundedCornerShape(15.dp))
                                            .background(color = box2)
                                            .clickable {
                                                Toast
                                                    .makeText(
                                                        context,
                                                        "Rewards",
                                                        Toast.LENGTH_SHORT
                                                    )
                                                    .show()
                                            }
                                    )
                                    Text(
                                        text = "Rewards",
                                        style = TextStyle(fontSize = 15.sp, color = textSkip),
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }

                                Spacer(modifier = Modifier.width(20.dp))
                                Column(
                                    modifier = Modifier.fillMaxHeight(),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.CenterHorizontally
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .width(60.dp)
                                            .height(60.dp)
                                            .clip(shape = RoundedCornerShape(15.dp))
                                            .background(color = box8)
                                            .clickable {
                                                Toast
                                                    .makeText(context, "More", Toast.LENGTH_SHORT)
                                                    .show()
                                            }
                                    ) {
                                        Icon(
                                            painter = painterResource(id = R.drawable.icon_more),
                                            contentDescription = null,
                                            modifier = Modifier
                                                .align(
                                                    Alignment.Center
                                                )
                                                .size(100.dp),
                                            tint = tint_more
                                        )
                                    }
                                    Text(
                                        text = "More",
                                        style = TextStyle(fontSize = 15.sp, color = textSkip),
                                        modifier = Modifier.padding(top = 10.dp)
                                    )
                                }
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 40.dp)
                                    .height(1.5.dp)
                                    .background(color = line)
                            ) {

                            }

                            Box(modifier = Modifier.fillMaxWidth()) {
                                Text(
                                    text = "Spendings",
                                    style = TextStyle(fontSize = 18.sp, color = textSkip),
                                    modifier = Modifier.padding(top = 20.dp, start = 30.dp)
                                )
                            }

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .padding(top = 20.dp, start = 30.dp)
                                        .width(60.dp)
                                        .height(60.dp)
                                        .clip(shape = RoundedCornerShape(15.dp))
                                        .background(color = user_color)
                                ) {
//                        Icon(painter = , contentDescription = )
                                }
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .padding(top = 20.dp, start = 10.dp),
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "Khalid EL Ashe",
                                        style = TextStyle(fontSize = 15.sp, color = title_color)
                                    )
                                    Text(
                                        text = "09 Des 2020",
                                        style = TextStyle(fontSize = 15.sp, color = date_color),
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(1f)
                                ) {
                                    Text(
                                        text = "+ $1.220.00",
                                        style = TextStyle(
                                            fontSize = 17.sp,
                                            color = total_plus_color
                                        ),
                                        modifier = Modifier.align(Alignment.Center)
                                    )
                                }
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 40.dp, start = 30.dp, end = 30.dp)
                                    .height(1.5.dp)
                                    .background(color = line)
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .padding(top = 20.dp, start = 30.dp)
                                        .width(60.dp)
                                        .height(60.dp)
                                        .clip(shape = RoundedCornerShape(15.dp))
                                        .background(color = box2)
                                ) {
//                        Icon(painter = , contentDescription = )
                                }
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .padding(top = 20.dp, start = 10.dp),
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "Metro Ticket",
                                        style = TextStyle(fontSize = 15.sp, color = title_color)
                                    )
                                    Text(
                                        text = "21 Des 2020",
                                        style = TextStyle(fontSize = 15.sp, color = date_color),
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(1f)
                                ) {
                                    Text(
                                        text = "- $0.00",
                                        style = TextStyle(
                                            fontSize = 17.sp,
                                            color = total_minus_color
                                        ),
                                        modifier = Modifier.align(Alignment.Center)
                                    )
                                }
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 40.dp, start = 30.dp, end = 30.dp)
                                    .height(1.5.dp)
                                    .background(color = line)
                            )

                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                verticalAlignment = Alignment.CenterVertically
                            ) {
                                Box(
                                    modifier = Modifier
                                        .padding(top = 20.dp, start = 30.dp)
                                        .width(60.dp)
                                        .height(60.dp)
                                        .clip(shape = RoundedCornerShape(15.dp))
                                        .background(color = box4)
                                ) {
//                        Icon(painter = , contentDescription = )
                                }
                                Column(
                                    modifier = Modifier
                                        .fillMaxHeight()
                                        .padding(top = 20.dp, start = 10.dp),
                                    verticalArrangement = Arrangement.Center
                                ) {
                                    Text(
                                        text = "Internet bill",
                                        style = TextStyle(fontSize = 15.sp, color = title_color)
                                    )
                                    Text(
                                        text = "21 Apr 2020",
                                        style = TextStyle(fontSize = 15.sp, color = date_color),
                                    )
                                }
                                Box(
                                    modifier = Modifier
                                        .fillMaxSize()
                                        .weight(1f)
                                ) {
                                    Text(
                                        text = "- $20.34",
                                        style = TextStyle(
                                            fontSize = 17.sp,
                                            color = total_minus_color
                                        ),
                                        modifier = Modifier.align(Alignment.Center)
                                    )
                                }
                            }

                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(
                                        top = 40.dp,
                                        start = 30.dp,
                                        end = 30.dp,
                                        bottom = 20.dp
                                    )
                                    .height(1.5.dp)
                                    .background(color = line)
                            )

                            Box(
                                modifier = Modifier
                                    .padding(bottom = 20.dp)
                                    .width(305.dp)
                                    .height(44.dp)
                                    .clip(shape = RoundedCornerShape(15.dp))
                                    .background(color = buttonCreateAccount)
                            ) {
                                Text(
                                    text = "See all", style = TextStyle(
                                        fontSize = 16.sp,
                                        color = Color.Black
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
        },
        bottomBar = {
            NavigationBar(containerColor = Color.White) {
                navs.forEach {
                    NavigationBarItem(
                        selected = true,
                        onClick = { navController.navigate(it.rout) },
                        icon = { /*TODO*/ },
                        label = {
                            Text(text = it.title, style = TextStyle(fontSize = 16.sp, color = Color.Black))
                        })
                }
            }
        }
    )
}

@Preview
@Composable
private fun SimpleComposablePreview() {
    val navController = rememberNavController()
    HomeScreen(navController = navController)
}