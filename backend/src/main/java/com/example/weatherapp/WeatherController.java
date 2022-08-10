package com.example.weatherapp;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WeatherController {

    private final WeatherService weatherSerivce;



    WeatherController(WeatherService weatherSerivce){
        this.weatherSerivce = weatherSerivce;
    }


    @GetMapping("/{city}")
    WeatherDto getWeatherForCity(@PathVariable String city){
        return weatherSerivce.getWeatherForCity(city);
    }

    @GetMapping("/forecast/{city}")
    ForecastListDto getWeatherForecastForCity(@PathVariable String city){
        return weatherSerivce.getWeatherForecastForCity(city);
    }






}
