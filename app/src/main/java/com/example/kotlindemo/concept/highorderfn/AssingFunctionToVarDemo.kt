package com.example.kotlindemo.concept.highorderfn

import kotlin.math.pow

fun main() {
    var sumFunction: (Double, Double) -> Double = ::sum
    println("Sum of 2 and 3 is ${sumFunction(2.0, 3.0)}")

    sumFunction = ::power
    println("Power of 2 and 3 is ${sumFunction(2.0, 3.0)}")
}

fun sum(a: Double, b: Double): Double {
    return a + b
}

fun power(a: Double, b: Double): Double {
    return a.pow(b)
}