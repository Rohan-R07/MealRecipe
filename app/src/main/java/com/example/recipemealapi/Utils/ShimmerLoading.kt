package com.example.recipemealapi.Utils

import androidx.compose.animation.animateColor
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.StartOffset
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.colorspace.WhitePoint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import com.example.recipemealapi.R
import com.example.recipemealapi.ui.theme.CDiscColor
import com.example.recipemealapi.ui.theme.CTextColor
import com.example.recipemealapi.ui.theme.CardImage
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.valentinilk.shimmer.Shimmer
import com.valentinilk.shimmer.ShimmerBounds
import com.valentinilk.shimmer.ShimmerTheme
import com.valentinilk.shimmer.rememberShimmer
import com.valentinilk.shimmer.shimmer

@Composable
fun ShimmerLoading(manBoxModifier: Modifier = Modifier) {


    Card(
        modifier = Modifier
            .width(150.dp)
//            .height(300.dp)
            .wrapContentHeight(),
        colors = CardColors(
            containerColor = CategoryScreen,
            contentColor = Unspecified,
            disabledContentColor = Gray,
            disabledContainerColor = Gray
        ),
    ) {

        val shimmerState = rememberShimmer(
            shimmerBounds = ShimmerBounds.View,
            theme = ShimmerTheme(
                animationSpec = infiniteRepeatable(
                    animation = tween(durationMillis = 800, easing = LinearEasing),
                    repeatMode = RepeatMode.Restart
                ),
                blendMode = BlendMode.SrcIn,
                rotation = 10f,
                shaderColors = listOf(
                    Color.LightGray.copy(alpha = 0.6f),
                    Color.White.copy(alpha = 0.3f),
                    Color.LightGray.copy(alpha = 0.6f)
                ),
                shaderColorStops = listOf(0.0f, 0.5f, 1.0f),
                shimmerWidth = 250.dp
            )
        )


        Box(
            modifier = manBoxModifier
                .clip(RoundedCornerShape(bottomEnd = 15.dp, bottomStart = 15.dp))
                .shimmer(shimmerState)
                .fillMaxWidth()
                .background(Color.Gray, RoundedCornerShape(8.dp))

                .height(174.dp)
        )

        Spacer(Modifier.padding(6.dp))



        Spacer(Modifier.padding(4.dp))

    }


}
//
//@Composable
//fun ShimmerProgress() {
//
//    val shimmerStte = rememberShimmer(shimmerBounds = ShimmerBounds.View)
//
//    Box(
//        modifier = Modifier
//            .height()
//            .shimmer(shimmerStte)
//    )
//
//}

@Preview
@Composable
private fun DJDEAD() {
    Column(Modifier.fillMaxSize()) {

        ShimmerLoading()
        ShimmerLoading(
            Modifier
                .height(20.dp)
                .width(100.dp)
        )
    }
}