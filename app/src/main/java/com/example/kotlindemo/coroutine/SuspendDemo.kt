package com.example.kotlindemo.coroutine

import kotlinx.coroutines.*

/** This class demonstrate the Suspend function demo.
 * @Author: Archana Kumari
 * @Date: 14-03-2023
 */
class SuspendDemo {
    companion object {
        suspend fun task1() {
            println("Hello task1 start")
            // yield()
            delay(2000)
            println("Hello task1 end")

        }
    }
/*    companion object {
        suspend fun task2() {
            println("Hello task2 start")
            // yield()
            delay(2000)
            println("Hello task2 end")
        }
    }*/
}