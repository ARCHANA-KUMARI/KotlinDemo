package com.example.kotlindemo.oops.extensionsdemo

/**
 * @Author: Archana Kumari
 * @Date: 05-12-2022
 */
open class BaseCaller {
    open fun Base.printFunctionInfo() {
        println("Base extension function in BaseCaller")
    }

    open fun Derive.printFunctionInfo() {
        println("Derive extension function in BaseCaller")
    }

     fun call(base: Base) {
        base.printFunctionInfo()
    }
}