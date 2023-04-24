
package com.example.kotlindemo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.kotlindemo.databinding.ActivityMainBinding
import com.example.kotlindemo.viewmodel.MainActivityViewModel
import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {
    private val TAG : String = "ArchanaMainActivity"
    private lateinit var mMainBinding : ActivityMainBinding
    private lateinit var mMainActivityViewModel : MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        mMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mMainBinding.root)
        mMainBinding.mainActivityViewmodel = mMainActivityViewModel
        mMainBinding.lifecycleOwner = this

     /*   // Sequential execution demo
        runBlocking<Unit> {
            val time = measureTimeMillis {
                val one = doSomethingUsefulOne()
                val two = doSomethingUsefulTwo()
                Log.d(TAG, "The answer is ${one + two}")
            }
            Log.d(TAG,"Completed in $time ms")
        }*/

        // Run parallelly
        runBlocking<Unit> {
            val time = measureTimeMillis {
                val one = async { doSomethingUsefulOne() }
                val two = async { doSomethingUsefulTwo() }

                Log.d(TAG, "The answer is one: ${one}")
                Log.d(TAG, "The answer is two: ${two}")
                Log.d(TAG, "The answer is one with await: ${one.await()}")
                Log.d(TAG, "The answer is two with await: ${two.await()}")
            }
            Log.d(TAG, "Completed in $time ms")
        }

        // Parallel execution demo
        CoroutineScope(Dispatchers.Main).launch {
            task1()
        }

        CoroutineScope(Dispatchers.Main).launch {
            task2()
        }
    }

    suspend fun doSomethingUsefulOne(): Int {
        delay(1000L) // pretend we are doing something useful here
        return 13
    }

    suspend fun doSomethingUsefulTwo(): Int {
        delay(1000L) // pretend we are doing something useful here, too
        return 29
    }
    suspend fun task1(){
        Log.d(TAG, "task1: starting " + Thread.currentThread()
        )
        //yield()
        delay(2000)
        Log.d(TAG, "task1: ending ")
    }

    suspend fun task2(){
        Log.d(TAG, "task2: starting " + Thread.currentThread())
      //  yield()
        delay(2000)
        Log.d(TAG, "task2: ending ")
    }
}

