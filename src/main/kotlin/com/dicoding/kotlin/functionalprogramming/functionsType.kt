package com.dicoding.kotlin.functionalprogramming


    typealias Arithmetic = (Int, Int) -> Int

    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }
