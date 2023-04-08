package com.example.kotlindemo.oops.Generic

/**
 * @Author: Archana Kumari
 * @Date: 08-04-2023
 */

fun main() {
    var data = Container<Int>(3)
    System.out.println("Int type data:" + data.getValue())
    var dataString = Container<String>("Lucca")
    System.out.println("String type data:" + dataString.getValue())
}

class Container<T>(var data: T) {
    fun setValue(value: T) {
        data = value
    }

    fun getValue(): T {
        return data
    }
}