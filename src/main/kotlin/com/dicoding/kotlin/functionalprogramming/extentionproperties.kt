package com.dicoding.kotlin.functionalprogramming

fun main() {
    println(10.slice)
}

val Int.slice: Int
    get() = this / 2