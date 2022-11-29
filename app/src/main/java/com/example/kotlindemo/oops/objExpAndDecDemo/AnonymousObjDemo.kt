package com.example.kotlindemo.oops.objExpAndDecDemo

/**
 * @Author: Archana Kumari
 * @Date: 30-10-2022
 */
fun main(array: Array<String>) {
    val anonymousObj = object {
            val hello = "Hello"
            val world = "World"
            override fun toString() = "$hello $world"
    }
    print(anonymousObj)
}
