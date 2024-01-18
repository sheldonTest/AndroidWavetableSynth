package com.aitronics.wavetablesynthesizer.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun SelectionButton() {
    //TODO: Move into viewmodel
    val waveType = arrayListOf<String>("Sine","Triangle","Square","Saw")
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly) {
        for(waves in waveType) {
            WaveTableButton(label = waves)
        }
    }
}

@Composable
fun WaveTableButton(
    onClick: () -> Unit = {},
    label: String = "") {

    Button(onClick = onClick) {
        Text(label)
    }
}