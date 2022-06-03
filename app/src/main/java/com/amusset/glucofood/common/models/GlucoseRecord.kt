package com.amusset.glucofood.common.models

import com.amusset.glucofood.common.enums.GlycemicIndex
import com.amusset.glucofood.common.enums.GlycemicIndex.*
import java.util.*
import kotlin.math.roundToInt

/**
 * [GlucoseRecord]: This class contains the information about the glucose behavior related to
 * a food. Depending of the way in the measure was took, a single measure or a Glucose History
 * Increment, the result can display the increment speed.
 */
data class GlucoseRecord(
    val glucoseLogs: List<GlucoseLog>,
    val foodId: String,
    val periodDay: String,
    val id: String = UUID.randomUUID().toString(),
    val createdDate: Long = Date().time,
    var incrementSpeed: Double? = null //TODO Pending method to get this value from glucoseLog
) {
    var glucoseAverage: Int = 0
        get() {
        var sum = 0.0
        glucoseLogs.forEach { sum += it.measure }
        return sum.div(glucoseLogs.size).roundToInt()
    }
/*    val glycemicIndexCategory: GlycemicIndex get() {
        return when {
            LOW.range.contains(glucoseMeasure) -> {
                LOW
            }
            MEDIUM.range.contains(glucoseMeasure) -> {
                MEDIUM
            }
            HIGH.range.contains(glucoseMeasure) -> {
                HIGH
            }
            else -> {
                DEFAULT
            }*/
        }
