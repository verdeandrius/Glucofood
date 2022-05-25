package com.amusset.glucofood.common.extensions

fun Int.minutesToMillis() = (60 * this * 1000).toLong()
