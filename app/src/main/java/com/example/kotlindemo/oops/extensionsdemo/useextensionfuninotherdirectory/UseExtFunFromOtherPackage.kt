package com.example.kotlindemo.oops.extensionsdemo.useextensionfuninotherdirectory

import com.example.kotlindemo.oops.extensionsdemo.addSuffixAndPrefix
import com.example.kotlindemo.oops.extensionsdemo.withAbc

fun main() {
    val str = "Archana"
    println(str.withAbc())
    println(str.addSuffixAndPrefix("hello ", " world"))
}