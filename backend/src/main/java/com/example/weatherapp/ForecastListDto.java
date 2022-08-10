package com.example.weatherapp;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ForecastListDto {

    private List<ForecastDto> list;

}
