package com.example.kotlindemo.oops.EnumDemo

/**
 * @Author: Archana Kumari
 * @Date: 21-09-2022
 */
enum class AnonynousEnum {
    WALKING {
        override fun signal() = WALKING
    },
    TALKING {
        override fun signal() = TALKING
    };
    abstract fun signal() : AnonynousEnum
}
