package com.example.kotlindemo.oops.interfaces

/**
 * @Author: Archana Kumari
 * @Date: 03-09-2022
 */
interface ChildInterfaceDemo : InterfaceInheritanceDemo {
    val firstName : String
    val lastName : String
    override val name: String get() = "$firstName $lastName"
}