package com.amusset.glucofood.common.models

import java.util.*

data class Profile(
    val name: String,
    val age: Int,
    val email: String,
    val userId: String = UUID.randomUUID().toString()
)
