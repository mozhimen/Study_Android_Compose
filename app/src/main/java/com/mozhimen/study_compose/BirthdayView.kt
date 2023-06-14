package com.mozhimen.study_compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mozhimen.study_compose.ui.theme.Study_Android_ComposeTheme

/**
 * @ClassName BirthdayGreetingWithText
 * @Description TODO
 * @Author Mozhimen & Kolin Zhao
 * @Date 2023/6/14 11:10
 * @Version 1.0
 */
@Preview(showBackground = true)
@Composable
fun BirthdayViewPreview() {
    Study_Android_ComposeTheme {
        BirthdayView.BirthdayGreetingWithImage(
            message = stringResource(R.string.happy_birthday_kolin),
            from = stringResource(R.string.from_kolin)
        )
    }
}

object BirthdayView {
    @Composable
    fun BirthdayGreetingWithText(message: String, from: String) {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = message,
                fontSize = 36.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
            )
            Text(
                text = from,
                fontSize = 24.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentWidth(align = Alignment.End)
                    .padding(start = 16.dp, end = 16.dp)
            )
        }
    }

    @Composable
    fun BirthdayGreetingWithImage(message: String, from: String) {
        Box {
            Image(
                painter = painterResource(id = R.drawable.androidparty),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight(),
                contentScale = ContentScale.Crop
            )
            BirthdayGreetingWithText(message = message, from = from)
        }
    }
}