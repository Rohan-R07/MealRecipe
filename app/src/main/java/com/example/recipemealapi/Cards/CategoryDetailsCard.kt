package com.example.recipemealapi.Cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.recipemealapi.R
import com.example.recipemealapi.ui.theme.CDiscColor
import com.example.recipemealapi.ui.theme.CTextColor
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.ViewRecipeColor

@Composable
fun CategoryDetailsCard(
    title: String,
    discription: String,
    thumb: String = "https:\\/\\/www.themealdb.com\\/images\\/media\\/meals\\/020z181619788503.jpg",
    onClick : () -> Unit
) {
    Card(
        modifier = Modifier
            .padding(start =17.dp, end = 17.dp,)
            .height(340.dp)
            .width(358.dp),
        colors = CardColors(
            containerColor = CategoryScreen,
            contentColor = Color.Unspecified,
            disabledContainerColor = Color.Unspecified,
            disabledContentColor = Color.Unspecified
        )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {

            AsyncImage(
                model = thumb,
                contentDescription = null,
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))
                    .width(358.dp)
                    .height(201.dp),
                placeholder = painterResource(R.drawable.outline_hide_image_24)
            )
            Spacer(Modifier.padding(top = 13.dp))
            Text(
                overflow = TextOverflow.Ellipsis,
                text = title,
                color = CTextColor,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                fontWeight = FontWeight.ExtraBold,
                fontSize = 22.sp,
                textAlign = TextAlign.Start,
                maxLines = 2
            )
            Spacer(Modifier.padding(top = 6.dp))

//
//            Text(
//                overflow = TextOverflow.Ellipsis,
//                text = discription,
//                color = CDiscColor,
//                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
//                fontWeight = FontWeight.ExtraBold,
//                fontSize = 18.sp,
//                textAlign = TextAlign.Start,
//                maxLines = 2,
//            )

            Button(
                onClick = {
                    onClick()
                },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 13.dp),
                colors = ButtonColors(
                    containerColor = ViewRecipeColor,
                    contentColor = White,
                    disabledContainerColor = Color.Unspecified,
                    disabledContentColor = Color.Unspecified
                )
            ) {
                Text("View Full Recipie ")
            }
        }
    }


}


@Preview
@Composable
private fun DOIEW() {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {

        items(10) {

            CategoryDetailsCard(

                title = "Lemon Herb Roasted Cff h hhh hht h h fff ffff fffhicken",
                discription = "Tender chicknn hhh hhhh y5g gth gthgr vht en with a zesty lemon and herb marinade",

            ){

            }

        }
    }
}