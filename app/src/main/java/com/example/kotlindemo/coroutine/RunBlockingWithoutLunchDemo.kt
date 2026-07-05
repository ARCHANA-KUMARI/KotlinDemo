package com.example.kotlindemo.coroutine
/** This class demonstrate the Suspend function demo.
 * @Author: Archana Kumari
 * @Date: 05-07-2026
 */

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

fun main() {
    println("start of main")
    runBlocking {
        delay(2000L)
        println("runBlocking after 2 seconds")
    }
    println("end of main")
}