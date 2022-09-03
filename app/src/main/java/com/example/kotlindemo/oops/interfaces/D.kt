package com.example.kotlindemo.oops.interfaces

/**
 * @Author: Archana Kumari
 * @Date: 03-09-2022
 */
class D : A, B {
    override fun foo() {
        println("I am in D`S FOO")
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        println("I am in D`s bar")
    }
}