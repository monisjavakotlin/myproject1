package com.monis

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlin.concurrent.thread
import kotlin.system.measureTimeMillis

fun main(args: Array<String>) {
    var counter = 0
    var ms = measureTimeMillis {
        for (i in 1..1_000_000) {
            GlobalScope.launch {
                counter++
            }
        }
    }
    println(ms)
}