package com.dicoding.kotlin.generics

fun main() {
    val numbers = (1..100).toList()
    print(numbers.slice(1..10))
}