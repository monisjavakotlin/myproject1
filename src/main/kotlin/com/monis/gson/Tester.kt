package com.monis.gson

import com.google.gson.Gson

//http://atm201605.appspot.com/h/
//{"account":"jack","date":"20160501","amount":1500,"type":0}

data class Transaction1(val account: String, val date: String, val amount: Int, val type: Int)


fun main(args: Array<String>) {
    val json = "{\"account\":\"jack\",\"date\":\"20160501\",\"amount\":1500,\"type\":0}"
    val transaction1 = Gson().fromJson<Transaction1>(json, Transaction1::class.java)
    println(transaction1)
}