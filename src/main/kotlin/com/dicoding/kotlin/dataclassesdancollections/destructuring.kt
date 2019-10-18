package com.dicoding.kotlin.dataclassesdancollections

data class DataUserr(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}
fun main(){
    val dataUser = DataUserr("nrohmen", 23)
    dataUser.intro()
}