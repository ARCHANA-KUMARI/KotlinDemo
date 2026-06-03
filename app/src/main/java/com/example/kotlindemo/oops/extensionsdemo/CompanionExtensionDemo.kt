package com.example.kotlindemo.oops.extensionsdemo

/**
 * @Author: Archana Kumari
 * @Date: 03-06-2026
 */
class CompanionExtensionDemo {
    companion object
}

fun CompanionExtensionDemo.Companion.showMessage() {
    println("Function declared in companion object")
}

fun main() {
    CompanionExtensionDemo.showMessage()
}