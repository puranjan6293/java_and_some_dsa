package com.company;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class Calling_API_JAVA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter City Name\n");
        String cityName = sc.nextLine();
        var url = "http://api.weatherapi.com/v1/current.json?key=7a4a45332c5b427b95e65456223008&q="+cityName+"&aqi=no";
        //http request
       var request =  HttpRequest.newBuilder().GET().uri(URI.create(url)).build();
       var client = HttpClient.newBuilder().build();
        HttpResponse<String> response = null;
        try {
            response = client.send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(response.body());

    }
}
