package com.dicoding.kotlin.dataclassesdancollections

fun main(){
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Jakarta"])
    println(capital.getValue("London"))
}