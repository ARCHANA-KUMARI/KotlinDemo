package com.example.kotlindemo.oops.delegation

import kotlin.concurrent.thread

/**
 * @Author: Archana Kumari
 * @Date: 17-10-2026
 */
val answer: Int by lazy {
    println("Computing the answer to the Ultimate Question of Life, the Universe, and Everything")
    42
}

fun main() {
    //1. Basic usage of lazy initialization
    println("1. ${Thread.currentThread().name}: $answer") // 42 // First access, triggers the lazy initialization it will print block and then print 42
    println("2. ${Thread.currentThread().name}: $answer") // 42
    //2. All threads will see the same value, and the initialization is thread-safe by default
    val t = thread(name = "worker") {
        println("3. ${Thread.currentThread().name}: $answer") // cached, no recompute
    }
    t.join()

    val t2 = thread(name = "worker2") {
        println("4. ${Thread.currentThread().name}: $answer") // cached, no recompute
    }
    t2.join()

}


// Read more about lazy initialization in Kotlin: https://kotlinlang.org/docs/delegated-properties.html#lazy
// Block executes only once, the first time the property is accessed. Subsequent accesses return the cached value.
// The lazy function takes a lambda that initializes the property. The lambda is executed only once, and the result is stored for future accesses.
// All threads will see the same value, and the initialization is thread-safe by default. If you need a different behavior, you can use the LazyThreadSafetyMode parameter to specify how the lazy property should be initialized in a multi-threaded environment.
//By default, the lazy function is thread-safe and guarantees that the initializer block is executed only once, even in a multi-threaded environment. If you want to change this behavior, you can use the LazyThreadSafetyMode parameter to specify how the lazy property should be initialized in a multi-threaded environment.
