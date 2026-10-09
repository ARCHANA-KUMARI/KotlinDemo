package com.example.kotlindemo.oops.extensionsdemo

// Append "abc" to any string
fun String.withAbc(): String = this + "abc"

fun main() {
    val result = "hello".withAbc() // "helloabc"
    println(result)
}
