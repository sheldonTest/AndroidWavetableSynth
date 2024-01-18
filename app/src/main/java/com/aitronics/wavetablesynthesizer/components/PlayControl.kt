package com.aitronics.wavetablesynthesizer.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import com.aitronics.wavetablesynthesizer.R

@Composable
fun PlayControl() {
    Text(text = "Play Control")
    Button(onClick = {

    }) {
        Text(text = stringResource(id = R.string.play))
    }
}
