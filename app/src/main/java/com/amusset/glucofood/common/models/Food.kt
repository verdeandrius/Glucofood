package com.amusset.glucofood.common.models

import java.util.*

/**
 * [Food] This object contains information related to the glucose behavior according to the food
 * ingested. Each time when the food was eaten is created a GlucoseRecord with details about hours
 * and glucose increment history if it is was took.
 */
data class Food(
    val userId: String,
    val name: String,
    val glucoseRecord: List<GlucoseRecord> = arrayListOf(),
    val calories: Int? = null,
    val id: String = UUID.randomUUID().toString(),
    val createdDate: Long = Date().time,
    var modificationDate: Long = createdDate
) {

    fun updateModificationDate(glucoseRecord: GlucoseRecord) {
        modificationDate = glucoseRecord.createdDate
    }
}
