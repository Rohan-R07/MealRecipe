package com.example.recipemealapi.Utils

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.selection.TextSelectionColors
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipemealapi.R
import com.example.recipemealapi.ui.theme.SearchBar
import com.example.recipemealapi.ui.theme.TextFieldCursor

@Composable
fun SearchTextField(textValue: MutableState<String>,perLetterTyped: @Composable () -> Unit,modifier :Modifier): MutableState<String> {

    TextField(
        value = textValue.value,
        onValueChange = { textValue.value = it },
        modifier = modifier
            .padding(20.dp)
            .fillMaxWidth(),
        leadingIcon = {
            Icon(
                painter = painterResource(R.drawable.explore_search),
                contentDescription = null,
                modifier = Modifier
                    .size(26.dp)
            )
        },
        colors = TextFieldColors(
            focusedTextColor = TextFieldCursor,
            unfocusedTextColor = TextFieldCursor,
            disabledTextColor = SearchBar,
            errorTextColor = SearchBar,
            focusedContainerColor = SearchBar,
            unfocusedContainerColor = SearchBar,
            disabledContainerColor = SearchBar,
            errorContainerColor = SearchBar,
            cursorColor = TextFieldCursor,
            errorCursorColor = TextFieldCursor,
            textSelectionColors = TextSelectionColors(
                handleColor = SearchBar,
                backgroundColor = SearchBar
            ),
            focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,
            disabledIndicatorColor = Color.Transparent,
            errorIndicatorColor = Color.Transparent,
            focusedLeadingIconColor = TextFieldCursor,
            unfocusedLeadingIconColor = TextFieldCursor,
            disabledLeadingIconColor = TextFieldCursor,
            errorLeadingIconColor = TextFieldCursor,
            focusedTrailingIconColor = TextFieldCursor,
            unfocusedTrailingIconColor = TextFieldCursor,
            disabledTrailingIconColor = TextFieldCursor,
            errorTrailingIconColor = TextFieldCursor,
            focusedLabelColor = TextFieldCursor,
            unfocusedLabelColor = TextFieldCursor,
            disabledLabelColor = TextFieldCursor,
            errorLabelColor = TextFieldCursor,
            focusedPlaceholderColor = TextFieldCursor,
            unfocusedPlaceholderColor = TextFieldCursor,
            disabledPlaceholderColor = TextFieldCursor,
            errorPlaceholderColor = TextFieldCursor,
            focusedSupportingTextColor = TextFieldCursor,
            unfocusedSupportingTextColor = TextFieldCursor,
            disabledSupportingTextColor = TextFieldCursor,
            errorSupportingTextColor = TextFieldCursor,
            focusedPrefixColor = Unspecified,
            unfocusedPrefixColor = Unspecified,
            disabledPrefixColor = Unspecified,
            errorPrefixColor = Unspecified,
            focusedSuffixColor = Unspecified,
            unfocusedSuffixColor = Unspecified,
            disabledSuffixColor = Unspecified,
            errorSuffixColor = Unspecified
        ),
        shape = RoundedCornerShape(13.dp),
        placeholder = {
            Text(
                text = "Search Dishes",
                fontSize = 20.sp,
                fontFamily = FontFamily(
                    Font(R.font.plus_jakarta_sans)
                )
            )
        },
        trailingIcon = {

            Icon(
                painter = painterResource(R.drawable.clear_text),
                contentDescription = null,
                tint = TextFieldCursor,
                modifier = Modifier
                    .clip(RoundedCornerShape(20.dp))

                    .size(30.dp)
                    .clickable {
                        textValue.value = ""
                    }

            )

        },
        textStyle = TextStyle(
            fontSize = 20.sp,
            color = TextFieldCursor,
        ),
        maxLines = 1


    )
    if(!textValue.value.isEmpty()){
        perLetterTyped.invoke()
    }

    return textValue
}
//
//@Preview
//@Composable
//private fun Serahie() {
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Top,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        val mutablest = remember {
//            mutableStateOf("")
//        }
//        Spacer(Modifier.padding(20.dp))
//        SearchTextField(mutablest,){
//            Log.d("Mealin","working")
//        }
//    }
//}
