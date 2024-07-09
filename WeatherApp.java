package org.example;

import com.google.gson.Gson;


import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class WeatherApp {
    public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
        Gson gson = new Gson();
        WeatherData wd = new WeatherData();

        HttpRequest getRequest = HttpRequest.newBuilder()
                .uri(new URI("https://weather.visualcrossing.com/VisualCrossingWebServices/rest/services/timeline/Greensboro%2CNC?unitGroup=us&include=days&key=PXSEDRLX2JH767BAJBT8RV6DN&contentType=json"))


                .build();

        HttpClient httpClient = HttpClient.newHttpClient();


        HttpResponse<String> getResponse = httpClient.send(getRequest, HttpResponse.BodyHandlers.ofString());
        wd = gson.fromJson(getResponse.body(), WeatherData.class);

        System.out.println(getResponse.body());
        System.out.println("\n");

//        Days FirstDay = wd.getDays().get(1);
//
//
//        System.out.println(FirstDay.getDescription());



        // Iterate over days and print each day's weather information
        //Uses the to string method in the Days class
        if (wd != null && wd.getDays() != null) {
            for (Days day : wd.getDays()) {
                System.out.println(day);
            }
        } else {
            System.out.println("No weather data available");
        }

    }
}
