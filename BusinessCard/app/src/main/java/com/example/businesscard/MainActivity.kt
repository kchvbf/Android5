package com.example.businesscard

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFFFB6C1)

                ) {
                    BusinessCard()
                }
            }
        }
        Log.d(getString(R.string.teg), "onCreate смс в логе")

        //finish()
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(getString(R.string.teg), "onRestart смс в логе")
    }
    override fun onStart() {
        super.onStart()
        Log.d(getString(R.string.teg), "onStart смс в логе")
    }

    override fun onResume() {
        super.onResume()
        Log.d(getString(R.string.teg), "onResume смс в логе")
    }

    override fun onPause() {
        super.onPause()
        Log.d(getString(R.string.teg), "onPause смс в логе")
    }


    override fun onStop() {
        super.onStop()
        Log.d(getString(R.string.teg), "onStop смс в логе")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(getString(R.string.teg), "onDestroy смс в логе")
    }
}

@Composable
fun BusinessCard() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val image = painterResource(R.drawable.logo)

        Text(
            text = stringResource(R.string.begin),
            fontSize = 20.sp,
            color = Color.Black,
            modifier = Modifier.padding(vertical = 10.dp)
        )

        Image(
            painter = image,
            contentDescription = null,
            Modifier.fillMaxHeight(0.5f),

            )

        Text(
            text = stringResource(R.string.sms),
            fontSize = 18.sp,
            color = Color.Black,
            modifier = Modifier.padding(horizontal = 25.dp, vertical = 10.dp),
            fontStyle = FontStyle.Italic
        )

        Spacer(
            modifier = Modifier.padding(bottom = 50.dp)
        )

        Text(
            text = stringResource(R.string.name),
            fontSize = 18.sp,
            color = Color.Black,
        )

        Spacer(
            modifier = Modifier.padding(bottom = 20.dp)
        )
        ContactRow(
            text = stringResource(R.string.number),
            icon = Icons.Rounded.Phone
        )
        ContactRow(
            text = stringResource(R.string.media),
            icon = Icons.Rounded.Share
        )
        ContactRow(
            text = stringResource(R.string.mail),
            icon = Icons.Rounded.Email
        )
    }
}

@Composable
fun ContactRow(
    text: String, icon: ImageVector
) {
    Row(
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(10.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color.Black,
            modifier = Modifier.weight(1.2f)
        )
        Text(
            text = text,
            color = Color.Black,
            fontSize = 15.sp,
            modifier = Modifier.weight(2f)


        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    Surface(
        modifier = Modifier.fillMaxSize(), color = Color(0xFFFFB6C1)
    ) {
        BusinessCardTheme {
            BusinessCard()
        }
    }
}