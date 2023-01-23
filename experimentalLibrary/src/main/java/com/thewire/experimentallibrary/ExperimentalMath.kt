package com.thewire.experimentallibrary

import kotlin.math.cbrt
import kotlin.math.pow

class ExperimentalMath {
    fun cube(num: Float): Float {
        println(add(num, num))
        return num.pow(3)
    }

    @OptIn(ExperimentalStdlibApi::class)
    fun cubeRoot(num: Float): Float {
        return cbrt(num.toDouble()).toFloat()
    }

    fun add(a: Float, b: Float): Float {
        return a+b
    }
}