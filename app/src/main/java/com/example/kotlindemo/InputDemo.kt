package com.example.kotlindemo

import java.util.*

class InputDemo {
    fun main(args : Array<String>) {
        val scanner = Scanner(System.`in`)
        println("Enter your age")
        var age = scanner.nextInt()
        println("Your input age is " + age)
    }
}