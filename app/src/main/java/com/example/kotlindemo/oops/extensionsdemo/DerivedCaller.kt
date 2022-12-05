package com.example.kotlindemo.oops.extensionsdemo

/**
 * @Author: Archana Kumari
 * @Date: 05-12-2022
 */

class DerivedCaller : BaseCaller() {
    override fun Base.printFunctionInfo() {
        println("Base extension function in DerivedCaller")
    }

    override fun Derive.printFunctionInfo() {
        println("Derive extension function in DerivedCaller")
    }
}