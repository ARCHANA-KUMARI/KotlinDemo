package com.example.kotlindemo.oops.Inline

/**
 * @Author: Archana Kumari
 * @Date: 29-10-2022
 */
fun main() {
    /*// Member
    val name = InlineMemberDemo("Kotlin")
    name.greet()
    println(name.length)*/

    // Inheritance with Inline class
    var name = InlineInheritance("Kotlin Demo")
    println(name.print())

}