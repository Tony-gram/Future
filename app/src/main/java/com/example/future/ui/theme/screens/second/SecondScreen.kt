package com.example.future.ui.theme.screens.second

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.future.R
import com.example.future.navigation.LOG_URL
import com.example.future.navigation.SIGN_URL
import com.example.future.ui.theme.FutureTheme

@Composable
fun SecondScreen(navController: NavHostController){
    Column(modifier = Modifier
        .fillMaxSize()
        .background(Color.Blue)) {
        Box (modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center){
            Box (modifier = Modifier
                .fillMaxWidth()
                .padding(start = 150.dp, top = 20.dp)){
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.logo) ,
                        contentDescription = "print",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop)
                }

            }

        }

    }
    Column(modifier = Modifier
        .padding(top = 400.dp, start = 70.dp)) {
        Box (modifier = Modifier
            .padding(start = 80.dp)){
            Button(onClick = { navController.navigate(LOG_URL)}) {
                Text(text = "Login")

            }

        }
        Spacer(modifier = Modifier.height(5.dp))
        Row {
            Spacer(modifier = Modifier.height(25.dp))
            Divider(modifier = Modifier
                .width(110.dp)
                .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                .height(2.dp),
                color = Color.Black)
            Text(text = "or")
            Divider(modifier = Modifier
                .width(110.dp)
                .padding(start = 10.dp, end = 10.dp, top = 10.dp)
                .height(2.dp),
                color = Color.Black)
        }
        Text(text = "Don't have an Account ?",
            modifier = Modifier
                .padding(start = 42.dp))
        Spacer(modifier = Modifier.height(15.dp))
        Box (modifier = Modifier
            .padding(start = 80.dp)){
            Button(onClick = { navController.navigate(SIGN_URL) }) {
                Text(text = "Sign Up")

            }
        }

    }

}
@Composable
@Preview(showBackground = true)
fun SecondScreenPreview(){
    FutureTheme {
        SecondScreen(navController = rememberNavController())
    }
}