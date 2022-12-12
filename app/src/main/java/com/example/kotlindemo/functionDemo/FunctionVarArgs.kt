package com.example.kotlindemo.functionDemo

/**
 * This class demostrate the example of vararg params type of function
 * @Author: Archana Kumari
 * @Date: 12-12-2022
 */
class FunctionVarArgs {
    fun names(vararg name: String) {
        println("Name is:" + name[0] + "-" + name[1])
    }
}