

package com.example.kotlindemo.arrayDemo

fun main(args:Array<String>){
    /*Array creation technique in kotlin */
    //Implicit array demo
    var arrayInteger = arrayOf(1,2,3,4,5)
    //Iterate
    println("Implicit Array:")
    for(i in 0.. arrayInteger.size - 1 ){
        println(arrayInteger.get(i))
    }

    // Explicit array demo
    var arrayExplicitInt = arrayOf<Int>(10,11,12,13,14,15)
    //Iterate
    println("Explicit Array:")
    for(i in 0.. arrayExplicitInt.size - 1){
        println(arrayExplicitInt.get(i))
    }

    // Create array using constructor demo
    var arrayUsingCtor = Array(5, {i -> i * 2})
    //Iterate
    println("Array by constructor")
    for(i in 0..arrayUsingCtor.size -1){
        println(arrayUsingCtor.get(i))
    }
}
