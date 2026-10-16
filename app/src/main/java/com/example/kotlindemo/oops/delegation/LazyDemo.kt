package com.example.kotlindemo.oops.delegation

/**
 * @Author: Archana Kumari
 * @Date: 17-10-2026
 */
val answer: Int by lazy {
    println("Computing the answer to the Ultimate Question of Life, the Universe, and Everything")
    42
}

fun main() {


    println("What is the answer?")
// Will print 'Computing...' and then 42
    println(answer) // 42
    println("Come again?")
// Will just print 42
    println(answer) // 42
}


// Read more about lazy initialization in Kotlin: https://kotlinlang.org/docs/delegated-properties.html#lazy
// Block executes only once, the first time the property is accessed. Subsequent accesses return the cached value.
// The lazy function takes a lambda that initializes the property. The lambda is executed only once, and the result is stored for future accesses.
// All threads will see the same value, and the initialization is thread-safe by default. If you need a different behavior, you can use the LazyThreadSafetyMode parameter to specify how the lazy property should be initialized in a multi-threaded environment.