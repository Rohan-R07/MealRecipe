package com.example.recipemealapi.Utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipemealapi.R
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor

@Composable
fun Ingredient(
    ingridient1: String?,
    ingridient2: String?,
    ingridient3: String?,
    ingridient4: String?,
    ingridient5: String?,
    ingridient6: String?,
    ingridient7: String?,
    ingridient8: String?,
    ingridient9: String?,
    ingridient10: String?,
    ingridient11: String?,
    ingridient12: String?,
    ingridient13: String?,
    ingridient14: String?,
    ingridient15: String?,
    ingridient16: String?,
    ingridient17: String?,
    ingridient18: String?,
    ingridient19: String?,
    ingridient20: String?,
) {

    Column(
        modifier = Modifier
            .padding(10.dp)
            .fillMaxWidth()
    ) {


        ingridient1?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient2?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient3?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient4?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient5?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient6?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient7?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient8?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient9?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient10?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient11?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient12?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient13?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient14?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient15?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient16?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient17?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient18?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient19?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }

        ingridient20?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Text(
                text = it,
                modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                color = TopAppBarTitleColor,
                fontSize = 18.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                textAlign = TextAlign.Start,
                softWrap = true,
                fontWeight = FontWeight.SemiBold
            )
        }
    }
}