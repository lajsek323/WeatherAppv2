package com.example.weatherapp;


import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class WeatherOpenDto {

    private WeatherCoordOpenDto coord;
    private WeatherWindOpenDto wind;
    private WeatherMainOpenDto main;
    private List<WeatherWeatherOpenDto> weather;
    private WeatherSunOpenDto sys;
    private long dt;
    private int timezone;
    private String name;




}
