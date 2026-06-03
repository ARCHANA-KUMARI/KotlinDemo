package com.example.kotlindemo.oops.extensionsdemo
/**
 * @Author: Archana Kumari
 * @Date: 03-06-2026
 */
fun main() {
    println("Welcome to extension function".formattedString())
}

fun String.formattedString() : String{
    return "............\nthis\n..............";
}