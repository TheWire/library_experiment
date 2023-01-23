package com.thewire.experimentallibrary

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val experimentalMath = ExperimentalMath()
    @Test
    fun cube_isCorrect() {
        assertEquals(27f, experimentalMath.cube(3f))
    }

    @Test
    fun cubeRoot_isCorrect() {
        assertEquals(3f, experimentalMath.cubeRoot(27f))
    }
}