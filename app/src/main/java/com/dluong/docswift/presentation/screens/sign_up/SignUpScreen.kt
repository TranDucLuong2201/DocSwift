package com.dluong.docswift.presentation.screens.sign_up

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dluong.docswift.R
import com.dluong.docswift.utils.Constant.MAX_LINE_TEXT

@Composable
fun SignUp(
    popUp: () -> Unit,

) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var name by remember { mutableStateOf("") }
    var showPassword by remember { mutableStateOf(false) }
    var checker by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
            .padding(vertical = 30.dp, horizontal = 20.dp),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(bottom = 30.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedButton(
                onClick = {}
            ) {
                Icon(
                    painter = painterResource(R.drawable.back_btn),
                    contentDescription = stringResource(R.string.back_btn)
                )
            }
            Text(
                "Need Help?",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.primary,
                textDecoration = TextDecoration.Underline
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(bottom = 40.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                "Register Your New Account!",
                style = MaterialTheme.typography.headlineLarge,
                color = MaterialTheme.colorScheme.onBackground,
                modifier = Modifier.padding(bottom = 20.dp),
                textAlign = TextAlign.Center
            )
            Text(
                "Enter your information below",
                style = MaterialTheme.typography.headlineSmall,
                textAlign = TextAlign.Center,
                color = MaterialTheme.colorScheme.surface,
                modifier = Modifier.padding(horizontal = 20.dp),
            )
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            OutlinedTextField(
                value = name,
                onValueChange = { name = it },
                label = { Text("Name") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 30.dp),
                maxLines = MAX_LINE_TEXT,
                textStyle = TextStyle(color = MaterialTheme.colorScheme.onBackground)
            )
            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 30.dp),
                maxLines = MAX_LINE_TEXT,
                textStyle = TextStyle(color = MaterialTheme.colorScheme.onBackground)
            )
            OutlinedTextField(
                value = password,
                onValueChange = { password = it },
                label = { Text("Password") },
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp),
                textStyle = TextStyle(color = MaterialTheme.colorScheme.onBackground),
                visualTransformation = if (showPassword) {
                    VisualTransformation.None
                } else {
                    PasswordVisualTransformation()
                },
                trailingIcon = {
                    IconButton(onClick = { showPassword = !showPassword }) {
                        Icon(
                            imageVector = if (showPassword) {
                                Icons.Filled.Visibility
                            } else {
                                Icons.Filled.VisibilityOff
                            },
                            contentDescription = if (showPassword) {
                                "Hide Password"
                            } else {
                                "Show Password"
                            }
                        )
                    }
                },
                maxLines = 1,
                singleLine = true
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.wrapContentSize()
            ) {
                Checkbox(
                    checked = checker,
                    onCheckedChange = { checker = it }
                )
                Text(
                    "By creating an account, you agree to our Term and Condition",
                    style = MaterialTheme.typography.titleSmall
                )
            }
        }
        Button(
            onClick = {
//                if (pagerState.currentPage == pagerState.pageCount - 1) {
//                    // Last page: Navigate to another screen
//                    navController.navigate(Screen.SignIn.route) // TODO: Change "NextScreen" to your target route
//                } else {
//                    // Move to the next page
//                    coroutineScope.launch {
//                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
//                    }
//                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 30.dp, top = 30.dp)
                .height(70.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                text = "Sign up",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier.padding(bottom = 20.dp)
        ) {
            HorizontalDivider(modifier = Modifier.weight(0.4f))
            Text(
                "or",
                modifier = Modifier.weight(0.2f),
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onBackground,
                textAlign = TextAlign.Center
            )
            HorizontalDivider(modifier = Modifier.weight(0.4f))
        }
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            OutlinedButton(
                onClick = {},
                modifier = Modifier.padding(start = 10.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.google_icon),
                    contentDescription = stringResource(
                        R.string.google_sign_in_button
                    )
                )
            }
            OutlinedButton(
                onClick = {},
                modifier = Modifier.padding(start = 10.dp),
            ) {
                Image(
                    painter = painterResource(R.drawable.facebook_icon),
                    contentDescription = stringResource(
                        R.string.google_sign_in_button
                    )
                )
            }
            OutlinedButton(
                onClick = {},
                modifier = Modifier.padding(start = 10.dp)
            ) {
                Image(
                    painter = painterResource(R.drawable.microsoft_icon),
                    contentDescription = stringResource(
                        R.string.google_sign_in_button
                    ),
                )
            }
        }
    }
}

@Composable
@Preview
fun SignUpPreview() {
//    SignUp(navController = rememberNavController())
}