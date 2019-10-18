package com.dicoding.kotlin.controlflow

fun main() {
    val warna = C.RED

    when(warna){
        C.RED -> print("Color is Red")
        C.BLUE -> print("Color is Blue")
        C.GREEN -> print("Color is Green")
    }
}

enum class C(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}