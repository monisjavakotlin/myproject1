package com.monis

import java.time.Duration
import java.time.LocalDateTime

fun main(args: Array<String>) {
    val enter: LocalDateTime = LocalDateTime.of(2018, 12, 25,
        8, 0, 0)
    val leave: LocalDateTime = LocalDateTime.of(2018, 12, 25,
        10, 0, 0)
    var car = Car("AAA-0001", enter)
    car.leave = leave
    println(car.duration())
    val hours = Math.ceil(car.duration() / 60.0).toLong()
    println(hours)
}

class Car(val id: String, val enter: LocalDateTime){
    var leave: LocalDateTime? = null
    set(value) {
        if (enter.isBefore(value)) {
            field = value
        }
    }

    fun duration(): Long {
        return Duration.between(enter,leave).toMinutes()
    }
}
