package com.example.kotlindemo.oops.extensionsdemo

interface User {
    val name: String
    val email: String
}

fun User.DisplayUserInfo(): String {
    return "User(name=$name, email=$email)"
}

class RegularUser(override val name: String, override val email: String) : User

fun main() {
    val user: User = RegularUser("Archana", "archana@example.com")
    println(user.DisplayUserInfo())
}