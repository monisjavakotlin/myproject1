package com.monis

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.concurrent.thread

fun main(args: Array<String>) {
    Thread({
        for (i in 1..10) {
            println("Thread: ${i}")
            Thread.sleep(50)
        }
    }).start()

    //此方法is better
    thread {
        for (i in 1..10) {
            println("thread: ${i}")
            Thread.sleep(50)
        }
    }

    GlobalScope.launch {
        for (i in 1..10) {
            println("Corountines: ${i}")
            delay(50L)
        }
    }
}