package com.aitronics.wavetablesynthesizer.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.aitronics.wavetablesynthesizer.components.ControlPanel
import com.aitronics.wavetablesynthesizer.components.SelectionPanel

@Composable
fun WavetableSynth() {
    Column(modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top) {
        SelectionPanel()
        ControlPanel()
    }

}