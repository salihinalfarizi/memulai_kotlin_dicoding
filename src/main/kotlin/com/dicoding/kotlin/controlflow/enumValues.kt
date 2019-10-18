package com.dicoding.kotlin.controlflow

fun main() {
    val color: A = A.valueOf("RED")
    print("Color is $color")
}

enum class A(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}