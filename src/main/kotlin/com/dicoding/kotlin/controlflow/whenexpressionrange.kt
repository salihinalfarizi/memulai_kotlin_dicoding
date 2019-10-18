package com.dicoding.kotlin.controlflow

fun main() {
    val nilai =  27
    val ranges = 10..50

    when(nilai){
        in ranges -> println("nilai is in the range")
        !in ranges -> println("niali is outside the range")
        else -> println("nilai undefined")
    }
}