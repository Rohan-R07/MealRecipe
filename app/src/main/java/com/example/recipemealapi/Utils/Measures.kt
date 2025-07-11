package com.example.recipemealapi.Utils

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
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
fun Measures(
    measures1: String?,
    measures2: String?,
    measures3: String?,
    measures4: String?,
    measures5: String?,
    measures6: String?,
    measures7: String?,
    measures8: String?,
    measures9: String?,
    measures10: String?,
    measures11: String?,
    measures12: String?,
    measures13: String?,
    measures14: String?,
    measures15: String?,
    measures16: String?,
    measures17: String?,
    measures18: String?,
    measures19: String?,
    measures20: String?,
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


        measures1?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient1.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures2?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient2.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures3?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient3.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures4?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient4.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures5?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient5.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures6?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient6.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures7?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient7.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures8?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient8.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures9?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient9.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures10?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient10.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures11?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient11.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures12?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient12.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures13?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient3.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures14?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient14.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures15?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient15.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures16?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient16.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures17?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient17.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures18?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient18.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures19?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient19.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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

        measures20?.takeIf { it.isNotBlank() && it != "null" }?.let {
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start
            ) {
                Text(
                    text = "${ingridient20.toString()}:- ",
                    modifier = Modifier.padding(start = 10.dp, top = 4.dp),
                    color = TopAppBarTitleColor,
                    fontSize = 18.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    textAlign = TextAlign.Start,
                    softWrap = true,
                    fontWeight = FontWeight.ExtraBold
                )
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
}