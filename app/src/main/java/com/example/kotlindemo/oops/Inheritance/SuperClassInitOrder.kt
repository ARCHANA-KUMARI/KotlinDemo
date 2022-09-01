package com.example.kotlindemo.oops.Inheritance

/**
 * @Author: Archana Kumari
 * @Date: 01-09-2022
 */
open class SuperClassInitOrder (val name : String){
    init { println("Initializing a base class") }

    open val size: Int =
        name.length.also { println("Initializing size in the base class: $it") }
}