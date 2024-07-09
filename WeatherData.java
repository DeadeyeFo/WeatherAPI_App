package org.example;

import java.util.List;

public class WeatherData {
    public List<Days> days;


    String conditions;
    String description;
    WeatherData (){

    }


    public List<Days> getDays() {
        return days;
    }

    public void setDays() {
        this.days = days;
    }
}
