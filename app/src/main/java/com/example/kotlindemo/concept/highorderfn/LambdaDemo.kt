package com.example.kotlindemo.concept.highorderfn

fun main() {
    val sum = { a: Int, b: Int -> a + b }
    val multiply = { a: Int, b: Int -> a * b }

    println("Sum of 2 and 3 is ${sum(2, 3)}")
    println("Multiplication of 2 and 3 is ${multiply(2, 3)}")

    // Void multiline lambda and it`s return type is Unit and it has no parameters and multilineLa
    val multilineLambda:()->Unit = {
        println("This is a multiline lambda")
        println("It can have multiple statements")
    }
    multilineLambda()
    
    val multilineLambdaReturn:()->Int = {
       println("This is a multiline lambda with a return value")
        val a: Int = 2+3
        "Hello to multilineLambda"
        2
    }
    println("multilineLambdaReturn = ${multilineLambdaReturn()}")

    val singleParamsLambda: (Int) -> Int = { x -> x * 2 }
    println("singleParamsLambda = ${singleParamsLambda(5)}")
}