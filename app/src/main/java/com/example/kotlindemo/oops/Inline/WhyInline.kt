package com.example.kotlindemo.oops.Inline

fun main() {
    message { println("Print this message") }
}

fun message(a: () -> Unit) {
    a.invoke()
}