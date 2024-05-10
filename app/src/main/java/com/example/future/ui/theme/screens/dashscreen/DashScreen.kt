package com.example.future.ui.theme.screens.dashscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.future.R
import com.example.future.navigation.HOME_URL
import com.example.future.navigation.HOTEL_URL
import com.example.future.navigation.LIKED_URL
import com.example.future.navigation.NOTIFICATION_URL
import com.example.future.navigation.PROFILE_URL
import com.example.future.ui.theme.FutureTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashScreen(navController: NavHostController,modifier: Modifier = Modifier) {
    //
    var isDrawerOpen by remember { mutableStateOf(false) }
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet {
                DrawerHeader(modifier)
                Divider()
                // Add more content to your drawer here
            }
        }
    ) {
            Scaffold(
                topBar = {
                    TopAppBar(title = { Text(text = stringResource(id = R.string.app_name))
                    },
                        navigationIcon =@Composable {
                            if (!isDrawerOpen) {
                                IconButton(onClick = { isDrawerOpen = true }) {
                                    Icon(
                                        Icons.Default.Menu,
                                        contentDescription = "Menu",
                                        tint = Color.Black
                                    )
                                }
                            }
                        },
                        actions = {
                            IconButton(onClick = { navController.navigate(PROFILE_URL) }) {
                                Icon(Icons.Filled.AccountCircle, contentDescription = "Proile")
                            }
                        }
                    )
                },
                content = {
                    LazyColumn(Modifier.padding(20.dp)) {
                        item {

                        }
                    }
                }
            )


    }
    Column(
            modifier = Modifier
                .fillMaxSize()

        ) {

        Spacer(modifier = Modifier.height(70.dp))
            Text(
                text = "Explore the",
                fontSize = 35.sp,
                modifier = Modifier
                    .padding(start = 20.dp)
            )
            Text(
                text = "Beautiful World",
                fontSize = 35.sp,
                fontWeight = FontWeight.ExtraBold,
                modifier = Modifier
                    .padding(start = 20.dp, top = 3.dp)
            )
            Spacer(modifier = Modifier.width(100.dp))
            var search by remember {
                mutableStateOf("")
            }
            Spacer(modifier = Modifier.height(5.dp))
            //Column 1
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
            ) {
                Row(
                    modifier = Modifier
                        .padding(15.dp)
                ) {
                    Column {
                        Card(
                            onClick = { navController.navigate(HOTEL_URL) }, modifier = Modifier
                                .height(85.dp)
                                .width(150.dp)
                        ) {
                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.img_5),
                                    contentDescription = "Tokyo",
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 15.dp)
                                        .clip(shape = CircleShape)
                                )

                                Column {
                                    Text(
                                        text = "Hotel",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(start = 80.dp, top = 25.dp)
                                    )
                                }

                            }
                        }
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Card(
                            onClick = { /*TODO*/ }, modifier = Modifier
                                .height(85.dp)
                                .width(155.dp)
                        ) {
                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.img_1,),
                                    contentDescription = "Tokyo",
                                    modifier = Modifier
                                        .padding(start = 6.dp, top = 15.dp)
                                        .clip(shape = CircleShape)
                                )

                                Column {
                                    Text(
                                        text = "Holiday",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(start = 82.dp, top = 25.dp)
                                    )
                                }

                            }
                        }
                    }
                }
            }
            //End of column 1
            //column 2
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
            ) {
                Row(
                    modifier = Modifier
                        .padding(15.dp)
                ) {
                    Spacer(modifier = Modifier.width(20.dp))

                }
            }
            //End of column 2
            //column 3
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
            ) {
                Row(
                    modifier = Modifier
                        .padding(15.dp)
                ) {
                    Column {
                        Card(
                            onClick = { /*TODO*/ }, modifier = Modifier
                                .height(85.dp)
                                .width(150.dp)
                        ) {

                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.img),
                                    contentDescription = "Tokyo",
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 15.dp)
                                        .clip(shape = CircleShape)
                                )

                                Column {
                                    Text(
                                        text = "Plane",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 20.sp,
                                        modifier = Modifier
                                            .padding(start = 88.dp, top = 25.dp)
                                    )
                                }

                            }
                        }
                    }
                    Spacer(modifier = Modifier.width(20.dp))
                    Column {
                        Card(
                            onClick = { /*TODO*/ }, modifier = Modifier
                                .height(85.dp)
                                .width(155.dp)
                        ) {

                            Box {
                                Image(
                                    painter = painterResource(id = R.drawable.img_2,),
                                    contentDescription = "Tokyo",
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 15.dp)
                                        .clip(shape = CircleShape)
                                )

                                Column {
                                    Text(
                                        text = "Harbour",
                                        fontWeight = FontWeight.Bold,
                                        fontSize = 19.sp,
                                        modifier = Modifier
                                            .padding(start = 80.dp, top = 25.dp)
                                    )
                                }
                            }
                        }
                    }
                }
            }
        }
    BottomBar(navController)
    }

@Composable
fun DrawerHeader(modifier: Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.Start,
        modifier = modifier
            .background(MaterialTheme.colorScheme.secondary)
            .padding()
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(id = R.string.app_name),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = MaterialTheme.colorScheme.onPrimary,
        )
    }
}

@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }
   Column (modifier = Modifier.padding(top = 600.dp)){
       BottomNavigation(
           elevation = 10.dp,
           backgroundColor = Color(0xff0FB06A)
       ) {

           BottomNavigationItem(icon = {
               Icon(imageVector = Icons.Default.Home, "", tint = Color.White)
           },
               label = { Text(text = "Home", color = Color.White) },
               selected = (selectedIndex.value == 0),
               onClick = {

                   navController.navigate(HOME_URL) {
                       popUpTo(HOME_URL) { inclusive = true }
                   }

               }
           )

           BottomNavigationItem(icon = {
               Icon(imageVector = Icons.Default.Favorite, "", tint = Color.White)
           },
               label = { Text(text = "Favorite", color = Color.White) },
               selected = (selectedIndex.value == 1),
               onClick = {
                   navController.navigate(LIKED_URL) {
                       popUpTo(HOME_URL) { inclusive = true }
                   }


               })
           BottomNavigationItem(icon = {
               Icon(imageVector = Icons.Default.Notifications, "", tint = Color.White)
           },
               label = {
                   Text(
                       text = "Find",
                       color = Color.White
                   )
               },
               selected = (selectedIndex.value == 2),
               onClick = {

                   navController.navigate(NOTIFICATION_URL) {
                       popUpTo(HOME_URL) { inclusive = true }
                   }

               }
           )


       }
   }
   }




@Composable
@Preview(showBackground = true)
fun DashScreenPreview() {
    FutureTheme {
        DashScreen(navController = rememberNavController())
    }
}