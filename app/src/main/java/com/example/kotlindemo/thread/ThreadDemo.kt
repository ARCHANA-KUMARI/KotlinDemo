package com.example.kotlindemo.thread

/**
 * @Author: Archana Kumari
 * @Date: 23-03-2023
 */
class ThreadDemo {
    companion object {
        fun longRunningTask(): Unit {
            while (true) {
                println("Infinite loop for thread understanding")
            }
        }
    }
}