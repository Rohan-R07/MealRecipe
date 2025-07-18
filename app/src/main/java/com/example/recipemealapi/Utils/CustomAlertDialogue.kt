package com.example.recipemealapi.Utils

import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.recipemealapi.R
import com.example.recipemealapi.RoomDatabase.SaveEntity
import com.example.recipemealapi.ViewModel.SavingViewModel
import com.example.recipemealapi.ui.theme.CTextColor
import com.example.recipemealapi.ui.theme.CategoryScreen

@Composable
fun CustomAlertDialog(savingViewModel: SavingViewModel,entity: SaveEntity,dialogState: MutableState<Boolean>) {

    if (dialogState.value) {

        AlertDialog(
//                modifier = Modifier
//                    .padding(3.dp),
            containerColor = CategoryScreen,
            onDismissRequest = {

                dialogState.value = false

            },
            confirmButton = {
                Button(
                    onClick = {
                        dialogState.value = false
                        savingViewModel.deleteDishes(entity)
                    },
                    colors = ButtonColors(
                        containerColor = Red,
                        contentColor = Black,
                        disabledContainerColor  = Unspecified,
                        disabledContentColor = Unspecified
                    )
                ) {
                    Text(text = "DELETE", fontSize = 20.sp, fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)))
                }
            },
            modifier = Modifier,
            dismissButton = {
                Button(
                    onClick = {
                        dialogState.value = false

                    }
                ) {
                    Text(text = "CANCEL", fontSize = 20.sp, fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)))                    }
            },
            title = {
                Text(
                    "Are  you sure you want to delete Permenantly",
                    fontSize = 23.sp,
                    fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                    color = CTextColor
                )
            },
            titleContentColor = CTextColor,
        )
    }

}