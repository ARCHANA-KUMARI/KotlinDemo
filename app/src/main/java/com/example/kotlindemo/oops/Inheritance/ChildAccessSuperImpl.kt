package com.example.kotlindemo.oops.Inheritance

/**
 * @Author: Archana Kumari
 * @Date: 01-09-2022
 */
class ChildAccessSuperImpl : SuperImplAccess() {
    override fun superMethod() {
        super.superMethod()
        print("Child Method")
    }
    val childProperty : String get() = super.superProperty
}