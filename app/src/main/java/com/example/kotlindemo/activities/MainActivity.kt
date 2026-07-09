
package com.example.kotlindemo.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.kotlindemo.databinding.ActivityMainBinding
import com.example.kotlindemo.viewmodel.MainActivityViewModel
import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onEach
import kotlinx.coroutines.flow.onEmpty
import kotlinx.coroutines.flow.onStart



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

        val channel = Channel<Int>()
        producer(channel) // Channel is hot
        consumer(channel)


        // Flow Demo

     /*   GlobalScope.launch {
            val data: Flow<Int> = producerBasedOnFlowApi() // Flow is hot if we comment collect then it will be not executed.
         *//*   data.collect {
                Log.d(TAG, "data from flow:" + it)
            }*//*
        }*/

        // Demo to cancel job then Flow will be also cancelled.

       /* val job = GlobalScope.launch {
            val data: Flow<Int> = producerBasedOnFlowApi() // Flow is hot if we comment collect then it will be not executed.
               data.collect {
                   Log.d(TAG, "data from flow:" + it)
               }
        }

        GlobalScope.launch { delay(5000)
            job.cancel()
        }
*/
        // Multiple consumer
     /*   GlobalScope.launch {
            val data: Flow<Int> = producerBasedOnFlowApi() // Flow is hot if we comment collect then it will be not executed.
            data.collect {
                Log.d(TAG, "data from flow consumer-1 :" + it)
            }
        }

        GlobalScope.launch {
            val data: Flow<Int> = producerBasedOnFlowApi() // Flow is hot if we comment collect then it will be not executed.
            data.collect {
                Log.d(TAG, "data from flow consumer-2 :" + it)
            }
        }*/

        // Multiple Consumer when one consumer join delayed of 5 seconds then also it will get data from
        // starting becuase it is code . Take example of netflix or prime video
     /*   GlobalScope.launch {
            val data: Flow<Int> = producerBasedOnFlowApi() // Flow is hot if we comment collect then it will be not executed.
            data.collect {
                Log.d(TAG, "data from flow consumer-1 :" + it)
            }
        }

        GlobalScope.launch {
            val data: Flow<Int> = producerBasedOnFlowApi() // Flow is hot if we comment collect then it will be not executed.
            delay(5000)
            data.collect {
                Log.d(TAG, "data from flow consumer-2 :" + it)
            }
        }*/


        // Flow operator demo:
       /* GlobalScope.launch {
            val data: Flow<Int> =
                producerBasedOnFlowApi() // Flow is hot if we comment collect then it will be not executed.
            delay(5000)
            data.onEmpty { Log.d(TAG, "onEmpty: ") }.onStart { Log.i(TAG, "onStart: ")
            emit(-1)}
                .onCompletion { Log.i(TAG, "onCompletion: ")
                emit(6)}.onEach { Log.i(TAG, "onEach: $it ") }
                .collect {
                    Log.d(TAG, "data from flow consumer :" + it)
                }
        }*/


        //  Flow Context Preservation(flowOn) + Exception Handling(catch)

     /*   GlobalScope.launch(Dispatchers.Main) {

            producerBasedOnFlowApiOnDiffContext().flowOn(Dispatchers.IO).collect {
                Log.d(TAG, "data from flow consumer :" + it)
            }
        }*/
/*

        //MutableSharedFlow demo
        GlobalScope.launch(Dispatchers.Main) {
            val result = producerBasedOnSharedSharedFlow()
            delay(5000)
            result.collect {
                Log.d(TAG, "data from flow consumer :" + it)
            }
        }
*/

        // MutableStateFlow demo
        GlobalScope.launch(Dispatchers.Main) {
            val result = producerBasedOnMutableSharedFlow()
            delay(6000)
            result.collect {
                Log.d(TAG, "data from flow consumer :" + it)
            }
        }




     /*   // Sequential execution demo
        runBlocking<Unit> {
            val time = measureTimeMillis {
                val one = doSomethingUsefulOne()
                val two = doSomethingUsefulTwo()
                Log.d(TAG, "The answer is ${one + two}")
            }
            Log.d(TAG,"Completed in $time ms")
        }*/

     /*   // Run parallelly
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
        }*/
/*
        // Parallel execution demo
        CoroutineScope(Dispatchers.Main).launch {
            task1()
        }

        CoroutineScope(Dispatchers.Main).launch {
            task2()
        }*/

        testCoroutineContext();
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
    // Coroutine Dispatcher

    private fun testCoroutineContext() {
        val parentJob = GlobalScope.launch(Dispatchers.Main) {
            Log.d(TAG, "parent testCoroutineContext: $coroutineContext")
            val childJob = GlobalScope.launch/*(*Dispatchers.IO)*/ {
                Log.d(TAG, "child testCoroutineContext: $coroutineContext")
            }

        }
    }

    fun producer(channel: Channel<Int>) {
        CoroutineScope(Dispatchers.Main).launch {
            channel.send(1)
            channel.send(2)
        }
    }

    fun consumer(channel: Channel<Int>) {
        CoroutineScope(Dispatchers.Main).launch {
            Log.d(TAG, "consumer: channel.receive() = ${channel.receive()}")
            Log.d(TAG, "consumer: channel.receive() = ${channel.receive()} ")
        }
    }

    private fun producerBasedOnFlowApi() = flow <Int>{
        Log.i(TAG, "producerBasedOnFlowApi: starts")
        val list = listOf(1,2,3,4,5,6,7,8,9,10)
        //val list = emptyList<Int>() // Demo for onEmpty callback
        list.forEach { delay(1000)
        emit(it)}
        Log.i(TAG, "producerBasedOnFlowApi: end")
    }

    private fun producerBasedOnFlowApiOnDiffContext() = flow<Int> {
        Log.i(TAG, "producerBasedOnFlowApiOnDiffContext: starts")
        val list = listOf(1, 2, 3, 4, 5)
        list.forEach {
            delay(1000)
            emit(it)
        }
        Log.i(TAG, "producerBasedOnFlowApiOnDiffContext: end")

    }

    private fun producerBasedOnSharedSharedFlow(): Flow<Int> {
        Log.i(TAG, "producerBasedOnSharedSharedFlow: starts")
        val mutableSharedFlow = MutableSharedFlow<Int>()
        GlobalScope.launch {
            val list = listOf(1, 2, 3, 4, 5)
            list.forEach {
                mutableSharedFlow.emit(it)
                Log.d(TAG, "producerBasedOnSharedSharedFlow:  emitted value: $it")
                delay(1000)
            }
        }
        Log.i(TAG, "producerBasedOnSharedSharedFlow: end")
        return mutableSharedFlow
    }

    private fun producerBasedOnMutableSharedFlow(): Flow<Int> {
        Log.i(TAG, "producerBasedOnMutableSharedFlow: starts")
        val mutableSharedFlow = MutableStateFlow<Int>(10)
        GlobalScope.launch {
            delay(2000)
            mutableSharedFlow.emit(20)
            delay(2000)
            mutableSharedFlow.emit(30)
        }
        Log.i(TAG, "producerBasedOnMutableSharedFlow: starts")
        return mutableSharedFlow
    }
}

