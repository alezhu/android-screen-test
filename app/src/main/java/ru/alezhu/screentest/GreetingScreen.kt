package ru.alezhu.screentest

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import ru.alezhu.screentest.ui.theme.GreetingViewModel
import ru.alezhu.screentest.ui.theme.ScreenTestTheme


@Composable
fun GreetingScreen(
    viewModel: GreetingViewModel = viewModel(),
) {
    GreetingScreen(
        color = viewModel.color.value,
        onClick = { viewModel.nextColor() },
    )
}

@Composable
private fun GreetingScreen(
    color: Color,
    onClick: () -> Unit,
) {
    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

        Surface(
            onClick = onClick,
            modifier = Modifier
//                .padding(innerPadding)
                .fillMaxSize(),
            color = color
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                contentAlignment = Alignment.Companion.Center
            ) {
                Text(text = "Tap screen", fontSize = TextUnit(10.0f, TextUnitType.Companion.Em))
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingScreenPreview() {
    ScreenTestTheme {
        GreetingScreen(
            Color.Green,
            onClick = {},
        )
    }
}
