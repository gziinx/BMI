package model

import androidx.compose.ui.graphics.Color

data class Bmi(
    var bmi: Pair<String, Double>,
    var bmiColor: Color,
    var bmiStatus: BmiStatus
)
