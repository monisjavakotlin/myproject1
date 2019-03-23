package com.monis.gson

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

data class Transaction(val account: String, val date: String, val amount: Int, val type: Int)

interface AtmService{
    @GET("h")
    fun listTransactions() : Call<List<Transaction>>
}

fun main() {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://atm201605.appspot.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(AtmService::class.java)

    val trans = service.listTransactions()
    trans.execute().body()?.forEach {
        println(it)
    }
}