package com.dicoding.kotlin.functionalprogramming

fun main(){
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct = text.distinctBy {
        it.length
    }

    println(distinct)
}