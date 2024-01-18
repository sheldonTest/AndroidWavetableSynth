package com.aitronics.wavetablesynthesizer.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.aitronics.wavetablesynthesizer.R

@Composable
fun ControlPanel() {
    Row(modifier = Modifier
        .fillMaxSize()
        .border(BorderStroke(5.dp, Color.Black)),
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {

        Column(
            modifier =
            Modifier
                .fillMaxHeight()
                .fillMaxWidth(0.7f)
                .border(BorderStroke(5.dp, Color.Black)),
            horizontalAlignment = Alignment.CenterHorizontally) {
            PitchControl()
            PlayControl()
        }
        Column(modifier = Modifier
            .fillMaxSize()
            .border(BorderStroke(5.dp, Color.Black)),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally) {
            VolumeControl()

        }

    }

}