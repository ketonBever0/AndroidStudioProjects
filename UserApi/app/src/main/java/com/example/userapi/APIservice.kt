package com.example.userapi

import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

private const val BASE_URL="https://randomuser.me/api/"
private val moshi= Moshi.Builder().add(KotlinJsonAdapterFactory()).build()

private val retrofit=Retrofit.Builder().addConverterFactory(MoshiConverterFactory.create(moshi)).baseUrl(BASE_URL).build()

interface APIservice {
    @GET("api")
    fun getDatas(@Query("results") result:Int): Call<UserResults>
}

object UserDataApi{
    val retrofitService:APIservice by lazy {
        retrofit.create(APIservice::class.java)
    }
}
        