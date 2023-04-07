package com.example.kotlindemo.viewmodel

import android.content.Intent
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlindemo.activities.HomeActivity
import kotlinx.coroutines.*
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

    fun onClickOfRunBlockingButton() {
        Log.i(TAG, "onClickOfRunBlockingButton: Before run blocking")
        runBlocking {
            // runBlocking only block Ui Thread
            /*   Log.i(TAG, "onClickOfRunBlockingButton: Start of Run blocking")
                 delay(2000)
                 Log.i(TAG, "onClickOfRunBlockingButton: Start of Run blocking")*/
            launch {
                Log.i(TAG ,"Current Thread: A" + Thread.currentThread())
                Log.i(TAG, "Launch A")
                delay(2000)
            }

            launch {
                Log.i(TAG, "Current Thread: B" + Thread.currentThread())
                Log.i(TAG, "Launch B")
                delay(2000)
            }
        }
        Log.i(TAG, "onClickOfRunBlockingButton: after run blocking")
    }

    fun onClickOfLaunchAppInGlobalScope(){
        GlobalScope.launch {  
            while (true){
                delay(2000)
                Log.d(TAG, "onClickOfLaunchAppInGlobalScope:  still working")
            }
        }

       GlobalScope.launch {

           delay(2000)
         //  Intent(this,HomeActivity.)
       }
    }

    // Can`t bind suspend function with view binding.
    suspend fun onClickOfRunWithContext() {
        Log.i(TAG, "onClickOfRunWithContext: Before")
        withContext(Dispatchers.IO) {
            delay(2000)
            Log.i(TAG, "onClickOfRunWithContext: Inside")
        }
        Log.i(TAG, "onClickOfRunWithContext: After")
    }
}