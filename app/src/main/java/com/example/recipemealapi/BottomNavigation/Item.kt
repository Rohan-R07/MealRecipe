package com.example.recipemealapi.BottomNavigation

import android.content.ClipData
import android.view.RoundedCorner
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipemealapi.R
import com.example.recipemealapi.ui.theme.CBottomIcon

@Composable
fun Item(
    selelcted: Boolean,
    name: String,
    icon: Int,
    iconFilled: Int,
    onClick : () -> Unit

    ) {
    Column (
        modifier = Modifier
            .padding(start = 15.dp)
            .width(45.dp)
            .clip(RoundedCornerShape(10.dp))
            .clickable{
                onClick()
            },
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            modifier = Modifier
                .size(30.dp),
            painter = if (selelcted) painterResource(iconFilled) else painterResource(icon),
            contentDescription = null,
            tint = if (selelcted) Black else CBottomIcon
        )
//        Spacer(Modifier.padding(10.dp))
        Text(
            name,
            fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
            fontSize = 13.sp,
            color = if (selelcted) Black else CBottomIcon,
            modifier = Modifier
                .padding(bottom = 3.dp, start = 1.dp,end = 2.dp)
        )
    }

}

//@Preview(showBackground = true)
//@Composable
//private fun DEDEdE() {
//    Item(
//        selelcted = true,
//        name = "Nome",
//        icon = painterResource(R.drawable.home),
//        iconFilled = painterResource(R.drawable.home),
//        ) { }
//}