package com.example.weather_compose.data.repository

import com.example.weather_compose.data.mappers.toWeatherInfo
import com.example.weather_compose.data.remote.WeatherApi
import com.example.weather_compose.domain.repository.WeatherRepository
import com.example.weather_compose.domain.weather.WeatherInfo
import com.example.weather_compose.presentation.domain.util.Resource
import java.lang.Exception
import javax.inject.Inject

class WeatherRepositoryImpl @Inject constructor(
    private val api: WeatherApi
): WeatherRepository {
    override suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo> {
        return try {
            Resource.Success(
                data = api.getWeatherData(
                    lat = lat,
                    long = long
                ).toWeatherInfo()
            )
        } catch (e: Exception){
            e.printStackTrace()
            Resource.Error(e.message ?: "An unknown error happened.")
        }
    }
}