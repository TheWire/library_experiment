package com.thewire.experimentallibrary

import kotlin.math.cbrt
import kotlin.math.pow

class ExperimentalMath {
    fun cube(num: Float): Float {
        return num.pow(3)
    }

    @OptIn(ExperimentalStdlibApi::class)
    fun cubeRoot(num: Float): Float {
        return cbrt(num)
    }
}