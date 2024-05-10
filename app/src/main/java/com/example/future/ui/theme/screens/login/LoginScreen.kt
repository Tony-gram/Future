package com.example.future.ui.theme.screens.login

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.easyt.data.AuthViewModel
import com.example.future.R
import com.example.future.ui.theme.FutureTheme


@Composable
fun LoginScreen(navController: NavHostController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Blue)

    )
    {

        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 120.dp)
                    .padding(top = 20.dp)
            ) {
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.logo),
                        contentDescription = "print",
                        modifier = Modifier
                            .size(50.dp)
                            .clip(shape = CircleShape),
                        contentScale = ContentScale.Crop
                    )
                    Text(
                        text = "",
                        fontWeight = FontWeight.Bold,
                        fontSize = 35.sp,
                        fontFamily = FontFamily.Cursive,
                        modifier = Modifier
                            .fillMaxWidth()
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        OutlinedTextField(
            value = email,
            onValueChange = { email = it },
            placeholder = { Text(text = "email",
                color = Color.White) },
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "email") },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(25.dp))
        OutlinedTextField(
            value = password,
            onValueChange = { password = it },
            placeholder = { Text(text = "Password",
                color = Color.White) },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Lock,
                    contentDescription = "Password"
                )
            },
            modifier =
            Modifier
                .fillMaxWidth()
                .padding(start = 30.dp, end = 30.dp),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )
        val context = LocalContext.current
        val authViewModel = AuthViewModel(navController, context)
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Spacer(modifier = Modifier.height(30.dp))
            Button(onClick = {
                authViewModel.login(email, password)
            }) {
                Text(text = "Sign In")
            }
        }
    }
}
@Composable
@Preview(showBackground = true)
fun LoginScreenPreview() {
    FutureTheme {
        LoginScreen(navController = rememberNavController())
    }
}