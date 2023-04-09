package com.example.kotlindemo.lembdas

/**
 * @Author: Archana Kumari
 * @Date: 09-04-2023
 */

fun main() {
    var sum = Sum()
    sum.addNumber(10, 15, object : ICalculator {
        override fun execute(sum: Int) {
            println(sum)
        }
    })
}

class Sum {
    fun addNumber(num1: Int, num2: Int, action: ICalculator) {
        val sum = num1 + num2
        action.execute(sum)
    }
}