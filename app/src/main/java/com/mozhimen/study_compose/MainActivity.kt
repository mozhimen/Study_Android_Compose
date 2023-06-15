package com.mozhimen.study_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.mozhimen.study_compose.ui.theme.Study_Android_ComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Study_Android_ComposeTheme {
                ActivityPreview()
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ActivityPreview() {
    DiceRollerViewPreview()
}