package com.example.weatherapp;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Getter
@Builder
@Setter
public class WeatherDto {

    private String cityName;
    private float lon;
    private float lat;
    private float temperature;
    private float pressure;
    private int humidity;
    private float windSpeed;
    private Date date;
    private int timezone;
    private String name;
    private List<WeatherWeatherOpenDto> weather;
    private Date sunrise;
    private Date sunset;

    public WeatherDto() {
    }

    public WeatherDto(String cityName,float lon, float lat, float temperature, float pressure,
                      int humidity, float windSpeed, Date date, int timezone,String name,
                      List<WeatherWeatherOpenDto> weather, Date sunrise, Date sunset) {

        Calendar calendar = Calendar.getInstance();
        Calendar calendar2 = Calendar.getInstance();
        Calendar calendar3 = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR_OF_DAY, timezone/3600);
        calendar2.setTime(sunrise);
        calendar2.add(Calendar.HOUR_OF_DAY, timezone/3600);
        calendar3.setTime(sunset);
        calendar3.add(Calendar.HOUR_OF_DAY, timezone/3600);
        this.cityName = cityName;
        this.lon = lon;
        this.lat = lat;
        this.temperature = temperature;
        this.pressure = pressure;
        this.humidity = humidity;
        this.windSpeed = (float) (windSpeed * 3.6);
        this.date = calendar.getTime();
        this.timezone = timezone/3600;
        this.name = name;
        this.weather = weather;
        this.sunrise = calendar2.getTime();
        this.sunset = calendar3.getTime();



    }




}
