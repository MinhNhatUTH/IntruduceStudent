package com.example.intruducestudent

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
                ProfileScreen()
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(100.dp))

        AvatarImage()

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Nguyễn Minh Nhật",
            fontSize = 30.sp
        )

        Text(
            text = "070206006644",
            fontSize = 30.sp
        )
    }
}

@Composable
fun AvatarImage() {
    Image(
        painter = painterResource(id= R.drawable.name),
        contentDescription = "Ảnh sinh viên",
        modifier = Modifier
            .size(110.dp)
            .clip(CircleShape),
        contentScale = ContentScale.Crop
    )
}