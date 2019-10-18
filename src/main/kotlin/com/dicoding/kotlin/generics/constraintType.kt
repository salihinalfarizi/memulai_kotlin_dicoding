package com.dicoding.kotlin.generics

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.sumNumber()
    val names = listOf("dicoding", "academy")
   // names.sumNumber() // error : inferred type String is not a subtype of Number
}

fun <T : Number> List<T>.sumNumber() {
    /* .. */
}