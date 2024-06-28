package com.example.weather

import android.telecom.Call
import androidx.core.text.util.LocalePreferences.TemperatureUnit.TemperatureUnits
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiInterface {
    @GET("weather")
    fun getWeatherData(
        @Query("q")city:String,
        @Query("appid") appid:String,
        @Query("units")units:String,

    ) : retrofit2.Call<WeatherApp>
}