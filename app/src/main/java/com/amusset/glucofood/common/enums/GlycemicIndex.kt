package com.amusset.glucofood.common.enums

enum class GlycemicIndex(val range: IntRange) {
    DEFAULT(0..100),
    LOW(0..55),
    MEDIUM(56..69),
    HIGH(70..100)
}