package ru.alezhu.screentest.ui.theme

import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel


private val appColors = listOf<Color>(Color.White, Color.Green, Color.Blue, Color.Red)

class GreetingViewModel : ViewModel() {
    private var _colorIndex by mutableIntStateOf(0)
    val color = derivedStateOf {
        appColors[_colorIndex]
    }

    fun nextColor(): Unit {
        _colorIndex = (_colorIndex + 1) % appColors.size
    }
}
