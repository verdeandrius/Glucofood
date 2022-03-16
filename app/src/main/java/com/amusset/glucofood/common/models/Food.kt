package com.amusset.glucofood.common.models

import com.amusset.glucofood.common.enums.GlycemicIndex
import com.amusset.glucofood.common.enums.GlycemicIndex.DEFAULT
import java.util.*

data class Food(
    val name: String,
    val glucoseLogs: List<GlucoseLog> = arrayListOf(),
    val id: String = UUID.randomUUID().toString(),
    val createdDate: Long = Date().time,
    var modificationDate: Long = Date().time
) {
    var glucoseAverage: Double = 0.0
    var glycemicIndexCategory: GlycemicIndex = DEFAULT

    fun updateModificationDate(glucoseLog: GlucoseLog) {
        modificationDate = glucoseLog.createdDate
    }

}
