package com.example.kotlindemo.oops.Inline

/**
 * @Author: Archana Kumari
 * @Date: 29-10-2022
 */
@JvmInline
value class InlineMemberDemo(val s : String) {
    init {
        require(s.length > 0)
    }

    val length: Int
        get() {
            return s.length;
        }

    fun greet() {
        println("Hello, $s")
    }
}