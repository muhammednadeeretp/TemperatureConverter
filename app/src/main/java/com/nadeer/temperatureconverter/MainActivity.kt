package com.nadeer.temperatureconverter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.nadeer.tempconverter.TemperatureConverter

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "CelToFahren: " + TemperatureConverter.celsiusToFahrenheit(10.0))
        Log.d(TAG, "CelToKelvin: " + TemperatureConverter.celsiusToKelvin(10.0))
        Log.d(TAG, "FahrenToCel: " + TemperatureConverter.fahrenheitToCelsius(10.0))
        Log.d(TAG, "FahrenToKelvin: " + TemperatureConverter.fahrenheitToKelvin(10.0))
        Log.d(TAG, "KelvinToCel: " + TemperatureConverter.kelvinToCelsius(10.0))
        Log.d(TAG, "KelvinToFahren: " + TemperatureConverter.kelvinToFahrenheit(10.0))
    }
}