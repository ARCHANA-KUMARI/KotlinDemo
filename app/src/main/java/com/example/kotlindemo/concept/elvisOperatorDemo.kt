package com.example.kotlindemo.concept

/**
 * @Author: Archana Kumari
 * @Date: 25-05-2023
 */

fun main() {
   // val word: String? = "Elvis"
    val word: String? = null
    val length: Int = word?.length ?: -1
    println("Length:" + length)
}
