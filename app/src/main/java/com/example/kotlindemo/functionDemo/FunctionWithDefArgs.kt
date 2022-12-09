package com.example.kotlindemo.functionDemo

/**
 * This class demonstrate method poc with default argument
 * @Author: Archana Kumari
 * @Date: 05-12-2022
 */
class FunctionWithDefArgs {
    // Function with def args
    fun read(id: Int, off: Int = 0, name: String = "Alisha Floric") {
        println("ID:" + id)
        println("Off is:" + off)
        println("Name is:" + name)
    }
}