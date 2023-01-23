package com.thewire.experimentallibrary

import java.lang.Math.cbrt
import kotlin.math.pow

class ExperimentalMath {
    fun cube(num: Float): Float {
        return num.pow(3)
    }

    fun cubeRoot(num: Float): Float {
        return cbrt(num.toDouble()).toFloat()
    }
}