package com.example.kotlindemo.oops.sealed

sealed  class Error {
    class FileReadError(val file: String): Error()
    class DatabaseError(val source: String): Error()
    object RuntimeError : Error()
}

fun main() {
    val errors = listOf(
        Error.FileReadError("example.txt"),
        Error.DatabaseError("usersDatabase"),
        Error.RuntimeError,
        compileTimeError()
    )

    errors.forEach { log(it) }
}

// Function to log errors
fun log(e: Error) = when(e) {
    is Error.FileReadError -> println("Error while reading file ${e.file}")
    is Error.DatabaseError -> println("Error while reading from database ${e.source}")
    is Error.RuntimeError -> println("Runtime error")
    // No `else` clause is required because all the cases are covered
    is compileTimeError -> println("Compile time error")
}