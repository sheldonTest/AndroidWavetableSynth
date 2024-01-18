package com.aitronics.wavetablesynthesizer.components

import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.VolumeMute
import androidx.compose.material.icons.filled.VolumeUp
import androidx.compose.material3.Icon
import androidx.compose.material3.Slider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp

@Composable
fun VolumeControl() {
    val screenHeight = LocalConfiguration.current.screenHeightDp
    val sliderHeight = screenHeight / 4
    val volume = rememberSaveable { mutableStateOf(-10F) }
    Content(volume = volume.value,
        sliderHeight = sliderHeight,
        onValue = {
        volume.value = it
    })
}

@Composable
fun Content(volume: Float,
            sliderHeight: Int,
            onValue: (Float) -> Unit) {

    Icon(imageVector = Icons.Filled.VolumeUp,contentDescription = "Volume Up")
    Slider(value = volume,
        onValueChange = {
            onValue(it)
        },
        modifier = Modifier
            .width(sliderHeight.dp)
            .rotate(270f),
        valueRange = -60F..0F)
    Icon(imageVector = Icons.Filled.VolumeMute,contentDescription = "Volume Mute")
}