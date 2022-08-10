package com.example.weatherapp;


import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ForecastDto {


    private WeatherWindOpenDto wind;
    private WeatherMainOpenDto main;
    private List<WeatherWeatherOpenDto> weather;
    private ForecastRainDto rain;
    private String dt_txt;


}
