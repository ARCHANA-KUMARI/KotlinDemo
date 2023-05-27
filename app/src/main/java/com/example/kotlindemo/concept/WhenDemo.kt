package com.example.kotlindemo.concept

/**
 * @Author: Archana Kumari
 * @Date: 24-05-2023
 */
class WhenDemo {

}

fun main(args : Array<String>){
   val time = 12
    when(time){
        in 0..11-> println("Good Morning")
        12 -> println("Time for lunch")
        else -> println("Good Day")
    }
}