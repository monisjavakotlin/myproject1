package com.monis.gson

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create
import retrofit2.http.GET

data class PM25(val site: String, val county: String, val pm25: Int, val date: String, val unit: String)

interface PM25Service {
//    @GET("?$format=json")
    fun listPM25() : Call<List<PM25>>
}

fun main(args: Array<String>) {
    val retrofit = Retrofit.Builder()
        .baseUrl("https://opendata.epa.gov.tw/ws/Data/ATM00625/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val service = retrofit.create(PM25Service::class.java)

    val values = service.listPM25().execute().body()?.forEach {
        println(it)
    }
}