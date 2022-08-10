package com.example.weatherapp;


import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class WeatherSunOpenDto {

    private long sunrise;
    private long sunset;
}
