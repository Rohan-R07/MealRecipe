package com.example.recipemealapi.Utils

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.recipemealapi.ui.theme.CategoryScreen
import kotlinx.coroutines.delay

@Composable
fun TypingText(
    fullText: String,
    typingSpeed: Long = 10L,// millis per character,
    modifier: Modifier,
    textAligh: TextAlign,
    fontSize: TextUnit,

    ) {

    var displayedText by rememberSaveable(fullText) { mutableStateOf("") }

    LaunchedEffect(fullText) {
        if (displayedText.isEmpty()) {
            for (char in fullText) {
                displayedText += char
                delay(typingSpeed)
            }
        }
    }




    ElevatedCard(
        modifier = Modifier
            .padding(start = 20.dp, end = 20.dp, bottom = 12.dp)
            .height(130.dp)
            .wrapContentHeight()
            .fillMaxWidth(),
        colors = CardColors(
            containerColor = CategoryScreen,
            contentColor = Unspecified,
            disabledContainerColor = Unspecified,
            disabledContentColor = Unspecified
        ),
        elevation = CardDefaults.elevatedCardElevation(
            defaultElevation = 12.dp
        )

    ) {
        LazyColumn {
            item {

                Text(
                    text = displayedText,
//            overflow = overFlow,
                    textAlign = textAligh,
//            maxLines = maxLines,
                    modifier = modifier
                        .padding(10.dp),
                    fontSize = fontSize
                )
            }
        }
    }

}