package com.example.kotlindemo.oops.extensionsdemo

// Append "abc" to any string
fun String.withAbc(): String = this + "abc"

fun main() {
    val result = "hello".withAbc() // "helloabc"
    println(result)

    val res = "world".addPrefix("hello ") // "hello world"
    println(res)
}

fun String.addPrefix(prefix: String) = prefix + this
//  ^ receiver ("this")      ^ parameter
fun String.addSuffixAndPrefix(prefix: String, suffix: String) = prefix + this + suffix
