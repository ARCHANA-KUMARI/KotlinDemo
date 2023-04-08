package com.example.kotlindemo.concept

/**
 * @Author: Archana Kumari
 * @Date: 08-04-2023
 */
fun main() {
    add(1, 1, 1, 1)
}

fun add(vararg data: Int) {
    var sum = 0
    for (i: Int in data) {
        sum = sum + i
    }
    println("Sum :" + sum)
}