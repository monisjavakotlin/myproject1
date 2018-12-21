package com.monis

import java.time.LocalDateTime

fun main(args: Array<String>) {
    val parkingLot = HashMap<String,Car?>()
    var enter = LocalDateTime.of(2018, 12, 25,
        8, 0, 0)
    var car:Car? = Car("AAA-0001", enter)
    parkingLot.put(car!!.id, car)
    car = Car("BBB-0002", enter.plusMinutes(15))
    parkingLot.put(car.id, car)
    //Car 1 leaving
    var leave = LocalDateTime.of(2018, 12, 25,
        9, 0, 0)
    car = parkingLot.get("AAA-0001")
    car?.leave = leave
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)
    //Car 2 leaving
    car = parkingLot.get("BBB-0002")
    car?.leave = leave.plusHours(2)
    println("${car?.id} duration: ${car?.duration()}")
    parkingLot.remove(car?.id)
    println(parkingLot.size)

    /*val list = listOf(5, 1, 2, 7)
    print(list)
    println()
    val scores = listOf(58, 88, 77, 99, 50)
    for (score in scores) {
        println(score)
    }
    println(list.get(3))
    var mutaList = mutableListOf(5, 1, 2, 7)
    mutaList.add(6)
    println(mutaList)*/

}