package com.example.kotlindemo.AbstractDemo

/**
 * @Author: Archana Kumari
 * @Date: 17-09-2022
 */
class NonOverrideOpenChildMethodDemo : NonOverrideOpenMethodDemo() {
    override fun display() {
        println("Display called of NonOverrideOpenChildMethodDemo")
    }
}