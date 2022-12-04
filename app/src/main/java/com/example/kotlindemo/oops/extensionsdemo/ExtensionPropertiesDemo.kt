package com.example.kotlindemo.oops.extensionsdemo

/**
 * @Author: Archana Kumari
 * @Date: 04-12-2022
 */
fun main(args: Array<String>){
 println("List last index" + listOf(1,2,3,).lastIndex)
}

val <T> List<T>.lastIndex: Int
get() = size - 1