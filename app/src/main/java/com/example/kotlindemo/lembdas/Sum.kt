package com.example.kotlindemo.lembdas

/**
 * @Author: Archana Kumari
 * @Date: 09-04-2023
 */

fun main() {
    var sum = Sum()
    // Using object oriented way interface
   /* sum.addNumber(10, 15, object : ICalculator {
        override fun execute(sum: Int) {
            println(sum)
        }
    })*/

//    {s -> println(s)} // Lambda Expression

}

class Sum {
    // Using object oriented way interface
    fun addNumber(num1: Int, num2: Int, action: ICalculator) {
        val sum = num1 + num2
        action.execute(sum)
    }

   /* fun addNumber(num1 : Int, num2 : Int, action: ICalculator){
        val sum = num1 + num2
    }*/

}