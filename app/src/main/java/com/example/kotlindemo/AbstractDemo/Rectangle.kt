package com.example.kotlindemo.AbstractDemo

/**
 * @Author: Archana Kumari
 * @Date: 17-09-2022
 */
class Rectangle : Polygon() {
    override fun draw() {
       println("Draw in Rectangle")
    }
}