package calcs

import androidx.compose.ui.graphics.Color
import model.Bmi
import model.BmiStatus
import kotlin.math.pow

fun bmiCalculate(weight: Int, height: Double): Bmi{
    val  bmiResult = weight / height.pow(2)
    when{
        bmiResult < 18.15 ->
            return Bmi(
                bmi = Pair("", bmiResult),
                bmiColor = Color.Cyan,
                bmiStatus = BmiStatus.UNDER_WEIGHT
            )
        bmiResult >= 18.5 && bmiResult < 25.0 ->
            return Bmi(
                bmi = Pair("", bmiResult),
                bmiColor = Color.Green,
                bmiStatus = BmiStatus.NORMAL
            )
        bmiResult >= 25.0 && bmiResult < 30.0 ->
            return Bmi(
                bmi = Pair("", bmiResult),
                bmiColor = Color.Yellow,
                bmiStatus = BmiStatus.OVER_WEIGHT
            )
        bmiResult >= 30.0 && bmiResult < 35.0 ->
            return Bmi(
                bmi = Pair("", bmiResult),
                bmiColor = Color(color = 3423423),
                bmiStatus = BmiStatus.OBSESITY_1
            )
        bmiResult >= 35.0 && bmiResult < 40.0 ->
            return Bmi(
                bmi = Pair("", bmiResult),
                bmiColor = Color.Red,
                bmiStatus = BmiStatus.OBSESITY_2
            )
        else ->
            return Bmi(
                bmi = Pair("", bmiResult),
                bmiColor = Color.Red,
                bmiStatus = BmiStatus.OBSESITY_3
            )

    }
}