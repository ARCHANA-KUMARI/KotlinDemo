package com.example.kotlindemo.oops.Inheritance

open class Shape {
    // Open is required it to override in subclass
    open fun draw(){
        println("I am in super class draw")
    }

    fun fill(){
        println("Super fill")
    }


}
