package com.example.kotlindemo.oops.Inline

/**
 * @Author: Archana Kumari
 * @Date: 29-10-2022
 */
@JvmInline
value class InlineRepresentation(val i : Int) : I {
}

fun asInline(inn : InlineRepresentation) {}
fun <T> asGeneric(x : T){}
fun asInterface(i : I){}
fun asNullable(i : InlineRepresentation) {}
fun <T> id(x: T) = x