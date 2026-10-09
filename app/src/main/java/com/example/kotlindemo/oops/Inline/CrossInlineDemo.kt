package com.example.kotlindemo.oops.Inline

fun main() {
    messageInlineDemo1 {
        println("Demo inline function")
        return@messageInlineDemo1      // local return: only exits the lambda
    }
    messageInlineDemo1 { println("Demo inline function after return") }
}

inline fun messageInlineDemo1(crossinline a: () -> Unit) {
    a.invoke()
}