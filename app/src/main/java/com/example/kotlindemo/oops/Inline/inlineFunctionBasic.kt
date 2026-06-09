package com.example.kotlindemo.oops.Inline

fun main() {
 messageInlineDemo { println("Demo inline function") }
}

inline fun messageInlineDemo(a:() -> Unit){
    a.invoke()
}