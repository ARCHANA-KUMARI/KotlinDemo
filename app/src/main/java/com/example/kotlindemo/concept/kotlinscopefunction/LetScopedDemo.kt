package com.example.kotlindemo.concept.kotlinscopefunction

fun main() {
    var str: String? = null
    str?.let {
        println("String is not null:$it")
        println("String length is: ${it?.length}")
    }

    str = "Archana"
    str?.let {
        println("String is not null:$it")
        println("String length is: ${it?.length}")
    }
}