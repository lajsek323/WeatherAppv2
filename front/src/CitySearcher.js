import React from "react"
import ReactSearchBox from "react-search-box";

const CitySearcher = (props) => {

const {setlocation, setWeather} = props;

return(

    <><input
        placeholder="Placeholder"
        value="Doe"
        onChange={(e) => setlocation(e.target.value)}>
    </input>
    <button type="submit"  onClick={setWeather}> 
        </button></>

);

};

export default CitySearcher;