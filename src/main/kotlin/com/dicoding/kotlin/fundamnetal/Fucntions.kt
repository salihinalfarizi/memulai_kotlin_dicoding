package com.dicoding.kotlin.fundamnetal

fun main() {
    val user = setUser("Ihin", 22)
    println(user)

    printUser("Ihin")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}