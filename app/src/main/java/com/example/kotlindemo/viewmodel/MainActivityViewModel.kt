package com.example.kotlindemo.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

/**
 * @Author: Archana Kumari
 * @Date: 23-03-2023
 */
class MainActivityViewModel : ViewModel() {
    private val TAG = "ArchanaMainViewModel"
    private var counter = MutableLiveData(0)
    val counters: LiveData<Int> = counter
    fun getCounter(): Int? {
        return counter.value
    }

    fun onClickOfBlockUiThread() {
        while (true) {
            //println("Blocking UI thread")
            // Inside thread
            thread(start = true) {
                println("Current Thread :" + Thread.currentThread().getName())
                println("Blocking UI thread")
            }
        }
    }

    fun onClickOfCounterButton() {
        counter.value = (counter.value)?.plus(1)
        println("OnClick of counter" + counter.value)
    }

    fun onClickLaunchCoroutine() {
        CoroutineScope(Dispatchers.IO).launch {
            Log.d(
                TAG,
                "onClickLaunchCoroutine: IO + ${Thread.currentThread().name}"
            )
        }

        CoroutineScope(Dispatchers.Main).launch {
            Log.d(TAG, "onClickLaunchCoroutine: Main+ ${Thread.currentThread().name}")
        }
        CoroutineScope(Dispatchers.Default).launch {
            Log.d(
                TAG,
                "onClickLaunchCoroutine: Default +  ${Thread.currentThread().name}"
            )
        }
    }
}