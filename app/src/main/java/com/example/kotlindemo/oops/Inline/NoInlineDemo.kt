package com.example.kotlindemo.oops.Inline

fun main() {
    show { println("Hello") }
}

inline fun show(noinline a: () -> Unit) {
    val x = a      // storing the lambda in a variable
    x()
}