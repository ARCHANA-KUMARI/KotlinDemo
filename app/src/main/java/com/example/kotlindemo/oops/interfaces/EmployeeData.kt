package com.example.kotlindemo.oops.interfaces

import android.icu.text.Transliterator

/**
 * @Author: Archana Kumari
 * @Date: 03-09-2022
 */
data class EmployeeData(override val firstName: String,
                        override val lastName: String,
                        val position: Int
) : ChildInterfaceDemo
