package com.example.kotlindemo.oops.extensionsdemo

import kotlin.random.Random

/**
 * @Author: Archana Kumari
 * @Date: 03-06-2026
 */
class Circle(val radious : Double) {
    fun area(): Double {
        return Math.PI * radious * radious
    }
}

fun Circle.computePerimeter(): Double {
    return 2 * Math.PI * radious
}


fun main() {
    val circle = Circle(2.5)
    println("Area: ${circle.area()}")
    println("Perimeter: ${circle.computePerimeter()}")
}