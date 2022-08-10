package com.example.weatherapp;


import lombok.*;

import java.util.List;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class ForecastOpenDto {


    private List<ForecastDto> list;


}
