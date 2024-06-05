package com.genius.utils

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CustomText(
    modifier: Modifier = Modifier,
    displayText: String,
) {
    Text(
        text = displayText,
        modifier = modifier,
    )
}
