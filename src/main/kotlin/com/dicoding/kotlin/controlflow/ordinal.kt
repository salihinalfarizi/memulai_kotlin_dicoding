package com.dicoding.kotlin.controlflow

fun main() {
    val color: B = B.GREEN

    print("Position GREEN is ${color.ordinal}")
}

enum class B(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}