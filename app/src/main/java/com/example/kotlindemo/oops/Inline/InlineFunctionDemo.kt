package com.example.kotlindemo.oops.Inline

/**
 * @Author: Archana Kumari
 * @Date: 27-02-2023
 */
fun main() {
    calculateTimeAndRun { loop(1000000) }
}

inline fun  calculateTimeAndRun(fn: () -> Unit) {
    val start: Long = System.currentTimeMillis();
    fn()
    val end: Long = System.currentTimeMillis()
    println("Time Taken ${end - start} ms")
}

fun loop(n: Long) {
    for (i: Long in 1..n) {
        //
    }
}