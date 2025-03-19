package com.dluong.docswift.presentation.screens.welcom

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.dluong.docswift.R
import com.dluong.docswift.domain.model.OnBoardingPage
import com.dluong.docswift.navigation.Screen
import com.dluong.docswift.utils.Constant.FIRST_INDEX_PAGE
import com.dluong.docswift.utils.Constant.ON_BOARDING_PAGE_COUNT
import kotlinx.coroutines.launch

@Composable
fun WelcomeScreen(navController: NavHostController) {
    val coroutineScope = rememberCoroutineScope()
    val pages = listOf(
        OnBoardingPage.First, OnBoardingPage.Second, OnBoardingPage.Third
    )
    val pagerState =
        rememberPagerState(initialPage = FIRST_INDEX_PAGE, pageCount = { ON_BOARDING_PAGE_COUNT })

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.background)
    ) {
        Spacer(modifier = Modifier.height(40.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
        ) {
            OutlinedButton(
                onClick = {},
            ) {
                Text(
                    text = "${pagerState.currentPage + 1} of 3",
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary
                )
            }
            TextButton(
                onClick = {
                    navController.navigate(Screen.SignIn.route)
                },
                modifier = Modifier.wrapContentSize(),
            ) {
                Text(
                    "Skip",
                    style = MaterialTheme.typography.labelLarge,
                    color = MaterialTheme.colorScheme.primary
                )
            }
        }

        // Horizontal Pager
        HorizontalPager(
            state = pagerState,
            verticalAlignment = Alignment.Top,
            modifier = Modifier.weight(1f) // Pager chiếm phần lớn màn hình
        ) { index ->
            PagerScreen(onBoardingPage = pages[index], index, pagerState)
        }

        // Circle Indicator
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(vertical = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            repeat(pagerState.pageCount) { iteration ->
                val color =
                    if (pagerState.currentPage == iteration) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.primaryContainer
                Box(
                    modifier = Modifier
                        .padding(horizontal = 4.dp)
                        .clip(CircleShape)
                        .background(color)
                        .size(12.dp) // Kích thước mỗi vòng tròn
                )
            }
        }
        Button(
            onClick = {
                if (pagerState.currentPage == pagerState.pageCount - 1) {
                    // Last page: Navigate to another screen
                    navController.navigate(Screen.SignIn.route) // TODO: Change "NextScreen" to your target route
                } else {
                    // Move to the next page
                    coroutineScope.launch {
                        pagerState.animateScrollToPage(pagerState.currentPage + 1)
                    }
                }
            },
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 16.dp)
                .height(70.dp),
            shape = RoundedCornerShape(20.dp)
        ) {
            Text(
                text = if (pagerState.currentPage == pagerState.pageCount - 1) "Get Started" else "Next",
                style = MaterialTheme.typography.labelLarge,
                color = MaterialTheme.colorScheme.onPrimary
            )
        }
    }
}

@Composable
fun PagerScreen(onBoardingPage: OnBoardingPage, index: Int, pagerState: PagerState) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = onBoardingPage.image),
                contentDescription = stringResource(R.string.on_boarding_image),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            )
            Text(
                text = onBoardingPage.title,
                color = MaterialTheme.colorScheme.primaryContainer,
                style = MaterialTheme.typography.displayMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 42.dp)
            )
            Text(
                text = onBoardingPage.description,
                color = MaterialTheme.colorScheme.surface,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 14.dp)
            )
        }
    }
}

@Composable
@Preview
fun SplashScreenPreview() {
    WelcomeScreen(navController = rememberNavController())
}