package com.example.kotlindemo.concept.highorderfn

fun main() {
    println(
        calculator(
            10.0,
            5.0,
            ::sum1
        )
    ) // passing normal function as an argument to the calculator function
}

fun sum1(a: Double, b: Double): Double {
    return a + b
}

fun calculator(a: Double, b: Double, op: (Double, Double) -> Double): Double {
    return op(a, b)
}