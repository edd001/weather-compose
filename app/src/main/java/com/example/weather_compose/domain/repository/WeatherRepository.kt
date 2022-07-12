package com.example.weather_compose.domain.repository

import com.example.weather_compose.domain.weather.WeatherInfo
import com.example.weather_compose.presentation.domain.util.Resource

interface WeatherRepository {
    suspend fun getWeatherData(lat: Double, long: Double): Resource<WeatherInfo>
}