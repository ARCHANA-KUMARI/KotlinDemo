package com.example.kotlindemo.flow

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

import kotlinx.coroutines.runBlocking

fun main() = runBlocking {
    val _state = MutableStateFlow(0)
    val state: StateFlow<Int> = _state

    _state.value = 1
    println("set:      ${state.value}")                 // 1

    _state.update { it + 1 }
    println("update:   ${state.value}")                 // 2

    val ok1 = _state.compareAndSet(expect = 1, update = 99)
    println("CAS(1):   $ok1, value=${state.value}")     // false, 2 (mismatch)

    val ok2 = _state.compareAndSet(expect = 2, update = 3)
    println("CAS(2):   $ok2, value=${state.value}")     // true, 3

    _state.tryEmit(4)
    println("tryEmit:  ${state.value}")                 // 4

    _state.emit(5)                                       // suspend, needs coroutine
    println("emit:     ${state.value}")                 // 5
}
