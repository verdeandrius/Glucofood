package com.amusset.glucofood.common.models

import java.util.Date
import java.util.UUID

data class GlucoseLog(
    val measure: Int,
    val foodId: String,
    val id: String = UUID.randomUUID().toString(),
    val createdDate: Long = Date().time
)
