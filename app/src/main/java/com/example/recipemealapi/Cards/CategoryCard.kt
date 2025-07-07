package com.example.recipemealapi.Cards

import android.Manifest
import android.content.Context
import android.net.ConnectivityManager
import android.net.http.HttpException
import android.util.Log
import android.widget.Toast
import androidx.annotation.RequiresPermission
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.rememberTimePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat.getSystemService
import coil.compose.AsyncImage
import coil.compose.AsyncImagePainter
import com.example.recipemealapi.DataModels.Category
import com.example.recipemealapi.R
import com.example.recipemealapi.ui.theme.CDiscColor
import com.example.recipemealapi.ui.theme.CTextColor
import com.example.recipemealapi.ui.theme.CardImage
import com.example.recipemealapi.ui.theme.CategoryScreen
import kotlinx.coroutines.delay

@RequiresPermission(Manifest.permission.ACCESS_NETWORK_STATE)
@Composable
fun CategoryCard(thumb: String, context: Context, text: String,discription: String,onClick : () -> Unit) {


    Card (
        modifier = Modifier
            .width(40.dp)
//            .height(300.dp)
            .wrapContentHeight(),
        colors = CardColors(
            containerColor = CategoryScreen,
            contentColor = Unspecified,
            disabledContentColor = Gray,
            disabledContainerColor = Gray
        ),
        onClick = {
            onClick()
        }

        ) {
        Box(
            modifier = Modifier
                .clip(RoundedCornerShape(bottomEnd = 15.dp, bottomStart = 15.dp))
                .fillMaxWidth()
                .height(174.dp)
        ) {
            var loadingState by remember { mutableStateOf(false) }


//            try {
//                 Toast.makeText(context,"not woring borther,", Toast.LENGTH_SHORT).show()
//
//            } catch (e: coil.network.HttpException) {
//                // Non-2xx HTTP code
//                Log.e("API", "HTTP error", e)
//            }


            AsyncImage(
                placeholder = painterResource(R.drawable.outline_hide_image_24),
                model = thumb,
                contentDescription = "Meal Thumbnail",
                onLoading = {
                    loadingState = true
                },
                modifier = Modifier
                    .fillMaxSize()
                    .background(CardImage),
                alignment = Alignment.Center,
                contentScale = ContentScale.Crop,
                onSuccess = {
                    loadingState = false
                },
                onError = {
                    // TODO on error handling
                },
            )

        }

        Text(
            text = text,
            color = CTextColor,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(top = 14.dp),
            fontSize = 17.sp,
            fontFamily = FontFamily(Font(R.font.plus_jakarta_sans))
        )

        Text(
            text = discription,
            color = CDiscColor,
            fontWeight = FontWeight.SemiBold,
            modifier = Modifier
                .padding(top = 8.dp),
            fontSize = 17.sp,
            fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
            maxLines = 3,
            overflow = TextOverflow.Ellipsis

        )

        Spacer(Modifier.padding(4.dp))

    }

}