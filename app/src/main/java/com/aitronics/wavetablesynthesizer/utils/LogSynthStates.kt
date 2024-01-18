package com.aitronics.wavetablesynthesizer.utils

import android.util.Log
import com.aitronics.wavetablesynthesizer.model.SynthFunctions
import com.aitronics.wavetablesynthesizer.model.Wavetable

class LogSynthStates : SynthFunctions {
    private var isPlaying: Boolean = false

    override suspend fun play() {
        Log.d("PLAY_STATE","Synth Is Playing")
        isPlaying = true
    }

    override suspend fun stop() {
        TODO("Not yet implemented")
    }

    override suspend fun isPlaying() : Boolean {
        TODO("Not yet implemented")
    }

    override suspend fun setFrequency(hertz: Float) {
        TODO("Not yet implemented")
    }

    override suspend fun setVolume(volume: Float) {
        TODO("Not yet implemented")
    }

    override suspend fun setWavetable(wavetable: Wavetable) {
        TODO("Not yet implemented")
    }
}