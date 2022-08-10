package com.example.weatherapp;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
public class ForecastRainDto {
    @JsonProperty("3h")
    private double rain3h;
}
