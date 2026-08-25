package com.example.kotlindemo.concept.highorderfn

fun isOdd(num: Int): Boolean {
    return num % 2 != 0
}

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val oddNumbers =
        numbers.filter(::isOdd) // passing normal function as an argument to the filter function
    println(oddNumbers) // Output: [1, 3, 5, 7, 9]

    val evenNumbers = numbers.filter(fun(a: Int): Boolean {
        return a % 2 == 0
    }) // passing lambda expression as an argument to the filter function
    println(evenNumbers) // Output: [2, 4, 6, 8, 10]
}