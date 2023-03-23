
package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.databinding.ViewDataBinding
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBindings
import com.example.kotlindemo.databinding.ActivityMainBinding
import com.example.kotlindemo.viewmodel.MainActivityViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.yield

class MainActivity : AppCompatActivity() {
    private val TAG : String = "MainActivity"
    private lateinit var mMainBinding : ActivityMainBinding
    private lateinit var mMainActivityViewModel : MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mMainActivityViewModel = ViewModelProvider(this).get(MainActivityViewModel::class.java)
        mMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(mMainBinding.root)
        mMainBinding.mainActivityViewmodel = mMainActivityViewModel
        mMainBinding.lifecycleOwner = this

        CoroutineScope(Dispatchers.Main).launch {
            task1()
        }

        CoroutineScope(Dispatchers.Main).launch {
            task2()
        }
    }

    suspend fun task1(){
        Log.d(TAG, "task1: starting ")
        yield()
        Log.d(TAG, "task1: ending ")
    }

    suspend fun task2(){
        Log.d(TAG, "task2: starting ")
        yield()
        Log.d(TAG, "task2: ending ")
    }
}

