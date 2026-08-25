package com.example.kotlindemo.concept.highorderfn

data class User(val id: Int, val name: String)
data class PaidUser(val id: Int, val name: String, val type: String)
fun main() {
    val users = listOf(
        User(1, "Alice"),
        User(2, "Bob"),
        User(3, "Charlie")
    )

    val paidUsers = users.map { user -> PaidUser(user.id, user.name, "Paid") }
    println(paidUsers)
}