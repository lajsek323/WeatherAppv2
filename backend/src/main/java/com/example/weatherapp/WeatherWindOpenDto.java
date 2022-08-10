package com.example.weatherapp;


import lombok.*;

@Getter
@Builder
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class WeatherWindOpenDto {

    private double speed;

    public double changeToKmh(){
        return speed * 3.6;
    }

}
