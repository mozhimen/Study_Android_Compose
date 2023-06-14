package com.mozhimen.study_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.mozhimen.study_compose.ui.theme.Study_Android_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Study_Android_ComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BirthdayView.BirthdayGreetingWithText(
                        message = stringResource(R.string.happy_birthday_kolin),
                        from = stringResource(R.string.from_kolin)
                    )
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun BirthdayGreetingPreview() {
    Study_Android_ComposeTheme {
        BirthdayView.BirthdayGreetingWithImage(
            message = stringResource(R.string.happy_birthday_kolin),
            from = stringResource(R.string.from_kolin)
        )
    }
}