package com.example.kotlindemo.concept.highorderfn

fun main() {
    println(calculate(
        10,
        5
    ) { a, b -> a + b } )// Lambda expression for addition and it is passed as an argument to the calculate function
    println(calculate(
        10,
        5
    ) { a, b -> a - b } )// Lambda expression for subtraction and it is passed as an argument to the calculate function
    println(calculate(
        10,
        5
    ) { a, b -> a * b } )// Lambda expression for multiplication and it is passed as an argument to the calculate function
    println(calculate(
        10,
        5
    ) { a, b -> a / b } )// Lambda expression for division and it is passed as an argument to the calculate function
}

fun calculate(a: Int, b: Int, operation: (Int, Int) -> Int): Int {
    return operation(a, b)
}