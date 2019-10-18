package com.dicoding.kotlin.oop

open class Animali(val name: String, protected val weight: Double)

class Caty(pName: String, pWeight: Double) : Animali(pName, pWeight)
fun main() {
    val cat = Caty("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
    //println("Berat Kucing: ${cat.weight}") //Cannot access 'weight': it is protected in 'Cat'
}
