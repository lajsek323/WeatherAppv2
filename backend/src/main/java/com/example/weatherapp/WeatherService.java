package com.example.weatherapp;


import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {


    private static final String Weather_URL = "https://api.openweathermap.org/data/2.5/";
    private static final String API_KEY = "??";
    private RestTemplate restTemplate = new RestTemplate();

    public WeatherDto getWeatherForCity(String city){

        WeatherOpenDto weatherOpenDto = restTemplate.getForObject(Weather_URL + "weather?q={city}&appid={apiKey}&units=metric&lang=pl",
                WeatherOpenDto.class,city,API_KEY);
        return WeatherDto.builder()
                .cityName(city)
                .temperature(weatherOpenDto.getMain().getTemp())
                .pressure(weatherOpenDto.getMain().getPressure())
                .humidity(weatherOpenDto.getMain().getHumidity())
                .windSpeed((float) weatherOpenDto.getWind().getSpeed())
                .lat(weatherOpenDto.getCoord().getLat())
                .timezone(weatherOpenDto.getTimezone())
                .date(new java.util.Date(weatherOpenDto.getDt()*1000))
                .lon(weatherOpenDto.getCoord().getLon())
                .name(weatherOpenDto.getName())
                .weather(weatherOpenDto.getWeather())
                .sunrise(new java.util.Date(weatherOpenDto.getSys().getSunrise()*1000))
                .sunset(new java.util.Date(weatherOpenDto.getSys().getSunset()*1000))
                .build();
    }


    public ForecastListDto getWeatherForecastForCity(String city){
        ForecastOpenDto forecastOpenDto = restTemplate.getForObject(Weather_URL + "forecast?q={city}&appid={apiKey}&units=metric&lang=pl",
                ForecastOpenDto.class,city,API_KEY);

        return ForecastListDto.builder()
                .list(forecastOpenDto.getList())
                .build();


    }





    }






