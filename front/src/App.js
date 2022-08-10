import {useState} from 'react'
import './App.css';
import React, { useEffect } from 'react';
import {Route, Link, Routes, useParams, Switch, BrowserRouter} from 'react-router-dom';
import WeatherInfo from './WeatherInfo';
import CitySearcher from './CitySearcher';


function App() {

  const [location, setLocation] = useState({})

  const [weather, setWeather] = useState({})


  console.log(location)

  return (
    <WeatherInfo />
      
  );

  }
export default App;
