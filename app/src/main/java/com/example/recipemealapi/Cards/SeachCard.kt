package com.example.recipemealapi.Cards

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.recipemealapi.ui.theme.CDiscColor
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor

@Composable
fun SearchCard(mealName: String, area: String, imageString: String? = null,clickable:() -> Unit) {

    Card(
        modifier = Modifier
            .height(100.dp)
            .clickable{
                clickable.invoke()
            }
            .fillMaxWidth(),
        colors = CardColors(
            containerColor = CategoryScreen,
            contentColor = Unspecified,
            disabledContentColor = Unspecified,
            disabledContainerColor = Unspecified
        ),
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize(),
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.Start
        ) {
            Column(
                modifier = Modifier
                    .width(220.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.Start

            ) {
                Text(
                    text = mealName,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(top = 10.dp, start = 3.dp),
                    color = TopAppBarTitleColor,
                    fontWeight = FontWeight.ExtraBold,
                    softWrap = true,
                    overflow = TextOverflow.Clip,
                    maxLines = 2
                )
                Text(
                    text = area,
                    fontSize = 20.sp,
                    modifier = Modifier
                        .padding(top = 10.dp, start = 3.dp, end =2.dp),
                    color = CDiscColor,
                    fontWeight = FontWeight.Medium,
                    softWrap = true,
                    overflow = TextOverflow.Clip
                )
            }
            AsyncImage(
                model = imageString,
                contentDescription = null,
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .fillMaxSize(),
                contentScale = ContentScale.Crop

            )
        }
    }
}

@Preview
@Composable
private fun CardPrev() {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Spacer(Modifier.padding(20.dp))
        SearchCard("Chicken Stir-Fry", "Chicken,Sallad"){

        }
    }
}