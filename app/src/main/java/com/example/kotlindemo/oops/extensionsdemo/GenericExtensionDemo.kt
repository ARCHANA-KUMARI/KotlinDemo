package com.example.kotlindemo.oops.extensionsdemo

fun main() {
    // Generic extension: works on a List of any type
    fun <T> List<T>.secondOrNull(): T? = getOrNull(1)

    println(listOf(1, 2, 3).secondOrNull())    // 2
    println(listOf("a", "b").secondOrNull())     // "b"
    println(listOf('x').secondOrNull())          // null
}