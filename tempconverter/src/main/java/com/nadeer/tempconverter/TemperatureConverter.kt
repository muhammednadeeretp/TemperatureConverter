package com.nadeer.tempconverter

object TemperatureConverter {

    fun celsiusToFahrenheit(celsius: Double) = celsius * 9 / 5 + 32

    fun celsiusToKelvin(celsius: Double) = celsius + 273.15


    fun fahrenheitToCelsius(fahrenheit: Double) = (fahrenheit - 32) * 5 / 9

    fun fahrenheitToKelvin(fahrenheit: Double) = (fahrenheit - 32) * 5 / 9 + 273.15


    fun kelvinToCelsius(kelvin: Double) = kelvin - 273.15

    fun kelvinToFahrenheit(kelvin: Double) = (kelvin - 273.15) * 9 / 5 + 32
}