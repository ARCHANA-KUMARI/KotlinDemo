package com.example.kotlindemo.coroutine

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    println("runBlocking starts: ${Thread.currentThread().name}")

    launch {
        delay(1000L)
        println("Coroutine 1 finished")
    }

    launch {
        delay(500L)
        println("Coroutine 2 finished")
    }

    println("End of runBlocking setup")
}