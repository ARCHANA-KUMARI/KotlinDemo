package com.example.kotlindemo.oops.Inheritance

/**
 * @Author: Archana Kumari
 * @Date: 01-09-2022
 */
open class SuperImplAccess {
    open fun superMethod(){
        println("Super Impl")
    }
    val superProperty : String get() = "black"

}