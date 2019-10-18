package com.dicoding.kotlin.dataclassesdancollections


        fun main(){
            val dataUser = DataUser("nrohmen", 17)
            val dataUser2 = DataUser("nrohmen", 17)
            val dataUser3 = DataUser("dimas", 24)

            println(dataUser.equals(dataUser2))
            println(dataUser.equals(dataUser3))

        }


