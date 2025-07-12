package com.example.recipemealapi.Screens.BottomNavScreens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.graphics.Color.Companion.Unspecified
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recipemealapi.R
import com.example.recipemealapi.ui.theme.CategoryScreen
import com.example.recipemealapi.ui.theme.SettingsText
import com.example.recipemealapi.ui.theme.TopAppBarTitleColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen() {
    Scaffold(
        modifier = Modifier
            .fillMaxSize(),
        containerColor = CategoryScreen,
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = "Profile",
                        fontWeight = FontWeight.Bold,
                        fontSize = 28.sp,
                        fontFamily = FontFamily(Font(R.font.plus_jakarta_sans))
                    )
                },
                colors = TopAppBarColors(
                    containerColor = CategoryScreen,
                    titleContentColor = TopAppBarTitleColor,
                    scrolledContainerColor = Gray,
                    navigationIconContentColor = Gray,
                    actionIconContentColor = Gray
                )
            )
        }
    ) { innerPadding ->

        Column(
            modifier = Modifier
                .fillMaxSize()
        ) {
            Spacer(Modifier.padding(11.dp))
            Column(
                modifier = Modifier
                    .padding(innerPadding)
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Image(
                    painter = painterResource(R.drawable.profile_picture),
                    contentDescription = null,
                    modifier = Modifier
                        .clip(shape = CircleShape)
                        .size(115.dp)
                        .fillMaxSize(),
                    contentScale = ContentScale.Inside,

                    )


                Text(
                    text = "Jhon Carter",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .wrapContentSize()
//                        .width(128.dp)
                        .padding(top = 16.dp),
                    textAlign = TextAlign.Center,
                    softWrap = true,
                )

                Text(
                    text = "Beginner",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(top = 1.dp)
                        .width(128.dp),
                    textAlign = TextAlign.Center,
                    softWrap = true,
                    color = SettingsText
                )

            }

            Text(
                text = "Settings",
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                fontFamily = FontFamily(Font(R.font.plus_jakarta_sans)),
                modifier = Modifier
                    .padding(15.dp),
            )


            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .clickable{
                    }
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
            ) {


                Icon(
                    painter = painterResource(R.drawable.settings),
                    contentDescription = null,
                    tint = Unspecified ,
                    modifier = Modifier
                        .padding(start = 10.dp,end = 10.dp)
                        .size(55.dp)
                        .clip(RoundedCornerShape(30.dp)),

                    )

                Text(
                    text = "App Settings",
                    color = TopAppBarTitleColor,
                    fontSize = 20.sp
                )
            }

            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .clickable{
                    }
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
            ) {


                Icon(
                    painter = painterResource(R.drawable.faqs),
                    contentDescription = null,
                    tint = Unspecified ,
                    modifier = Modifier
                        .padding(start = 10.dp,end = 10.dp)
                        .size(55.dp)
                        .clip(RoundedCornerShape(30.dp)),

                    )

                Text(
                    text = "FAQs",
                    color = TopAppBarTitleColor,
                    fontSize = 20.sp
                )
            }

            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .clickable{
                    }
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
            ) {


                Icon(
                    painter = painterResource(R.drawable.custome_support),
                    contentDescription = null,
                    tint = Unspecified ,
                    modifier = Modifier
                        .padding(start = 10.dp,end = 10.dp)
                        .size(55.dp)
                        .clip(RoundedCornerShape(30.dp)),

                    )

                Text(
                    text = "Customer Support",
                    color = TopAppBarTitleColor,
                    fontSize = 20.sp
                )
            }

            Row(
                modifier = Modifier
                    .padding(10.dp)
                    .clickable{
                    }
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(30.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Start,
            ) {


                Icon(
                    painter = painterResource(R.drawable.about),
                    contentDescription = null,
                    tint = Unspecified ,
                    modifier = Modifier
                        .padding(start = 10.dp,end = 10.dp)
                        .size(55.dp)
                        .clip(RoundedCornerShape(30.dp)),

                    )

                Text(
                    text = "About us",
                    color = TopAppBarTitleColor,
                    fontSize = 20.sp
                )
            }
        }
    }
}
