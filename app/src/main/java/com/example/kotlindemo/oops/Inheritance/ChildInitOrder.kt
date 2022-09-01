package com.example.kotlindemo.oops.Inheritance

/**
 * @Author: Archana Kumari
 * @Date: 01-09-2022
 */
class ChildInitOrder (name: String, val lastName: String) : SuperClassInitOrder(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }){
    init { println("Initializing a derived class") }
}