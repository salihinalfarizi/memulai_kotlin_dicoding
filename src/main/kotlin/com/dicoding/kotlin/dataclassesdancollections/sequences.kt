package com.dicoding.kotlin.dataclassesdancollections

fun main() {
    val list = (1..1000000).toList()
    list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }
}