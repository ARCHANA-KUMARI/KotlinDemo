package com.example.kotlindemo.oops.Inheritance

class Rectangle : Shape() {
    final override fun draw() {
        println("Rectangle draw")
    }
}