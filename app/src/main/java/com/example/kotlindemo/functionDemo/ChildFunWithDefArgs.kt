package com.example.kotlindemo.functionDemo

/**
 * This class demonstrate fun overloading with default value
 * @Author: Archana Kumari
 * @Date: 09-12-2022
 */
class ChildFunWithDefArgs : FunctionWithDefArgs() {
    override fun read(id: Int, off: Int, name: String) {
        super.read(id, off, name)
    }
}