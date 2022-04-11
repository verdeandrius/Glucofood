package com.amusset.glucofood.common.models

import java.util.Date
import java.util.UUID

/**
 * [GlucoseLog]: This class represent a measure made using a glucometer.
 */
data class GlucoseLog(
    val measure: Int,
    val foodId: String,
    val id: String = UUID.randomUUID().toString(),
    val createdDate: Long = Date().time
)
