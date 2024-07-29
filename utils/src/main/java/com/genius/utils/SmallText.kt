package com.genius.utils

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

/**
 * @Author: Thulasirajan P
 * @github: https:github.com/itsgeniuS
 * @Date: 29/07/24
 */
@Composable
fun SmallText(
	modifier : Modifier = Modifier,
	text : String,
) {
	Text(
		text = text,
		modifier = modifier,
		style = MaterialTheme.typography.bodySmall,
	)
}
