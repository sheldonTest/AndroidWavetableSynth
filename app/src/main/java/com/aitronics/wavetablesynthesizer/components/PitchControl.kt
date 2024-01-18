package com.aitronics.wavetablesynthesizer.components

import androidx.compose.material3.Slider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.res.stringResource
import com.aitronics.wavetablesynthesizer.R

@Composable
fun PitchControl() {
    val frequency = rememberSaveable{ mutableStateOf( 300F) }  //TODO get from view model

    ControlContent(
        label = stringResource(id = R.string.frequency),
        value = frequency.value, onValueChange = {
            frequency.value = it
        }, valueRange = 40F..3000F)

}

@Composable
private fun ControlContent(
    label: String,
    value: Float,
    onValueChange: (Float) -> Unit,
    valueRange: ClosedFloatingPointRange<Float>

) {

    Text(text = label)
    Slider(value = value, onValueChange = { onValueChange(it) }, valueRange = valueRange)
    Text(text = "$value Hz")
}