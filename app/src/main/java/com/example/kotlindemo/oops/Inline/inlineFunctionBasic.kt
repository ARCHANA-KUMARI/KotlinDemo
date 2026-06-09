package com.example.kotlindemo.oops.Inline

fun main() {
    messageInlineDemo {
        println("Demo inline function")
        return
    }
    messageInlineDemo { println("Demo inline function after return") }
}

inline fun messageInlineDemo(a: () -> Unit) {
    a.invoke()
}