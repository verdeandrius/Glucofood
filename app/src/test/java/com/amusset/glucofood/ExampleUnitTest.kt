package com.amusset.glucofood

import com.amusset.glucofood.common.extensions.minutesToMillis
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun minutesToMillis() {
        assertEquals(300000, 5.minutesToMillis())
    }
}