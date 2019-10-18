package com.dicoding.kotlin.controlflow

fun main() {
    val colorRed = Color.RED
    val colorGreen = Color.GREEN
    val colorBlue = Color.BLUE
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}