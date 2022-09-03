package com.example.kotlindemo.oops.interfaces

/**
 * @Author: Archana Kumari
 * @Date: 03-09-2022
 */
interface InterfaceProperties {
    val property : Int // abstract
    val propertyWithImpl : String get() = "Foo"
    fun methodWithBody(){
        println("I am inside methodWithBody")
        println("property is" + property)
    }
}