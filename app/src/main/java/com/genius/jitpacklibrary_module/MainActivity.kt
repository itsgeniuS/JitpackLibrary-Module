package com.genius.jitpacklibrary_module

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.genius.jitpacklibrary_module.ui.theme.JitpackLibraryModuleTheme
import com.genius.utils.SmallText
import com.genius.utils.toastLong
import com.genius.utils.toastShort

class MainActivity : ComponentActivity() {
	override fun onCreate(savedInstanceState : Bundle?) {
		super.onCreate(savedInstanceState)
		enableEdgeToEdge()
		setContent {
			JitpackLibraryModuleTheme {
				Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
					Box(
						modifier = Modifier
							.padding(innerPadding)
							.fillMaxSize(),
						contentAlignment = Alignment.Center,
						content = {
							Column {
								Greeting(
									text = "Short",
									isShortToast = true,
								)
								Spacer(modifier = Modifier.padding(top = 30.dp))
								Greeting(
									text = "Long",
									isShortToast = false,
								)
							}
						},
					)
				}
			}
		}
	}
}

@Composable
fun Greeting(
	modifier : Modifier = Modifier,
	text : String,
	isShortToast : Boolean,
) {
	val context = LocalContext.current
	SmallText(
		modifier = modifier.clickable {
			if (isShortToast) {
				context.toastShort("This is a short toast!")
			} else {
				context.toastLong("This is a long toast!")
			}
		},
		text = "Click me to show $text toast!",
	)
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
	JitpackLibraryModuleTheme {
		Greeting(text = "Click me to show toast", isShortToast = true)
	}
}