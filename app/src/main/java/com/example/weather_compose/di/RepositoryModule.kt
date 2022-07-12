package com.example.weather_compose.di

import com.example.weather_compose.data.location.DefaultLocationTracker
import com.example.weather_compose.data.repository.WeatherRepositoryImpl
import com.example.weather_compose.domain.location.LocationTracker
import com.example.weather_compose.domain.repository.WeatherRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.ExperimentalCoroutinesApi
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindWeatherRepository(weatherRepository: WeatherRepositoryImpl): WeatherRepository
}