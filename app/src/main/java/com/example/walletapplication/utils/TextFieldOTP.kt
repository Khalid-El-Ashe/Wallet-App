package com.example.walletapplication.utils

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.walletapplication.ui.theme.buttonCreateAccount
import com.example.walletapplication.ui.theme.buttonStart

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TextFieldOTP(
    value: MutableState<TextFieldValue>,
    content: String,
    enabled: Boolean,
    padding: Int,
    leadingIcon: @Composable () -> Unit,
    trailingIcon: @Composable () -> Unit,
    keyboardType: KeyboardType
) {
    TextField(
        value = value.value, onValueChange = { text ->
            value.value = text
        },
        enabled = enabled,
        label = { Text(text = content, style = TextStyle(fontSize = 14.sp, color = buttonStart)) },
        leadingIcon = {
            leadingIcon()
        },
        trailingIcon = {
            trailingIcon()
        },
        colors = TextFieldDefaults.outlinedTextFieldColors(textColor = buttonStart),
        keyboardOptions = KeyboardOptions(
            keyboardType = keyboardType,
            imeAction = ImeAction.Done
        ),
        modifier = Modifier
            .width(65.dp)
            .height(65.dp)
            .padding(top = padding.dp)
            .clip(shape = RoundedCornerShape(15.dp))
            .background(color = buttonCreateAccount)
    )
}
