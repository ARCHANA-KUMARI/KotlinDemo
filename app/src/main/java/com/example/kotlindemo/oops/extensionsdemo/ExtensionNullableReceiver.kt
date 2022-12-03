package com.example.kotlindemo.oops.extensionsdemo

/**
 * @Author: Archana Kumari
 * @Date: 04-12-2022
 */
fun main(args: Array<String>){
    println("Nullable Ext:" + Any().toString())
    println("Nullable Ext:" + null.toString())
}

fun Any?.toString(): String {
    if (this == null) return "null"
    // after the null check, 'this' is autocast to a non-null type, so the toString() below
    // resolves to the member function of the Any class
    return toString()
}