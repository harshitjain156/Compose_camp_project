package com.example.compose_camp_project

import android.util.Log.d
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Chat( onNext:()->Unit) {

    Column(modifier = Modifier
        .fillMaxSize()
        .padding(24.dp), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.SpaceAround) {
//        Image(painter = painterResource(id = R.drawable), contentDescription ="" , modifier = Modifier
//            .clip(
//                CircleShape
//            )
//            .size(360.dp), contentScale = ContentScale.Crop)
         Column(modifier = Modifier.fillMaxWidth(), horizontalAlignment = Alignment.CenterHorizontally) {
             Image(painter = painterResource(id = com.example.compose_camp_project.R.drawable.app_messages_icon), contentDescription = "")
             Text(text = "Jet Chat", fontWeight = FontWeight.ExtraBold, fontSize = 24.sp, color = MaterialTheme.colors.primary)

         }



        IconButton(onClick = onNext, modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colors.primary)) {
            Icon(Icons.Default.ArrowForward, contentDescription = "", tint = MaterialTheme.colors.onPrimary    )
        }

    }
}