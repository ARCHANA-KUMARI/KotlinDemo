package com.example.kotlindemo.functionDemo
// Without body
fun sum(a: Int, b: Int)  = a + b
fun max(a : Int, b: Int) : Int = if(a > b) a else b
/*//With body
fun sum(a: Int, b: Int): Int {
    return a + b
}*/

fun main() {
    print("sum of 3 and 5 is ")
    println(sum(3, 5))
    println(max(3, 5))
}