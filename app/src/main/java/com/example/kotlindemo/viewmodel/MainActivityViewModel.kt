package com.example.kotlindemo.viewmodel

import android.view.View
import androidx.lifecycle.ViewModel

/**
 * @Author: Archana Kumari
 * @Date: 23-03-2023
 */
public class MainActivityViewModel : ViewModel() {
    fun onClickOfBlockUiThread() {
        while (true) {
            println("Blocking UI thread")
        }
    }
}