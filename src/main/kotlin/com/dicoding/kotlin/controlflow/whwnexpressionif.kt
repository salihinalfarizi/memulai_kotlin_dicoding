package com.dicoding.kotlin.controlflow

fun main(){
    val anyType: Any = 100L
    when (anyType) {
        is Long -> println("the nilai has a Long type")
        is Int -> println("the nilai has a Int type")
        is Double -> println("the nilai has a Double type")
        else -> println("undefined")
    }
}