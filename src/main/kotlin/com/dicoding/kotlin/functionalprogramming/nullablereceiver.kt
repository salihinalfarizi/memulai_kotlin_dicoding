package com.dicoding.kotlin.functionalprogramming

fun main() {
    val value: Int? = null
    val value1: Int? = null

    println(value?.slicea)
    println(value1?.slicea)
}

val Int.slicea: Int
    get() = this.div(2)