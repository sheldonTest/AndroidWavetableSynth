package com.aitronics.wavetablesynthesizer.model

import androidx.annotation.StringRes
import com.aitronics.wavetablesynthesizer.R

enum class Wavetable {
    SINE {
        override fun toResourceString(): Int {
            return R.string.sine
        }

         },TRIANGLE {
        override fun toResourceString(): Int {
            return R.string.triangle
        } },SQUARE {
        override fun toResourceString(): Int {
            return R.string.square
        } },SAW {
        override fun toResourceString(): Int {
            return R.string.saw
        } };

    @StringRes
    abstract fun toResourceString(): Int
}

interface SynthFunctions {
   suspend fun play()
   suspend fun stop()
   suspend fun isPlaying() : Boolean
   suspend fun setFrequency(hertz: Float)
   suspend fun setVolume(volume: Float)
   suspend fun setWavetable(wavetable: Wavetable)
}