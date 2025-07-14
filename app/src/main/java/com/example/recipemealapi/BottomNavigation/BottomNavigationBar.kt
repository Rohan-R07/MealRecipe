package com.example.recipemealapi.BottomNavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation3.runtime.NavBackStack
import com.example.recipemealapi.NavRoutes.BottomNavRoutes
import com.example.recipemealapi.R
import com.example.recipemealapi.ui.theme.BottomNavigationBar


@Composable
fun CBotomNavigationBar(bBackStack: NavBackStack, navIndex: MutableState<Int>) {

//    var indext by remember { mutableIntStateOf(0) }


    BottomAppBar(
        modifier = Modifier
            .fillMaxWidth(),
        containerColor = BottomNavigationBar,
        tonalElevation = 3.dp,

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {

            itemLists.forEachIndexed { index, item ->
                Item(
                    selelcted = navIndex.value == index,
                    name = item.name,
                    icon = item.icon,
                    iconFilled = item.iconFilled,
                    onClick = {
                        navIndex.value = index
                        bBackStack.removeAll { true }
                        bBackStack.add(item.route)
                    }
                )
                Spacer(
                    Modifier.padding(
                        20.dp
                    )
                )
            }
        }
    }


}