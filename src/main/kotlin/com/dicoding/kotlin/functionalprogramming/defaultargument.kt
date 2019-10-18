package com.dicoding.kotlin.functionalprogramming

fun main() {
    val fullName = getFullNamea()
    print(fullName)
}

fun getFullNamea(first: String = "Kotlin", middle: String = " is ", last: String = "Awesome"): String {
    return "$first $middle $last"
}