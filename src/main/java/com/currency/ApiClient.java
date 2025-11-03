package com.currency;

import org.json.JSONObject;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ApiClient {
    private static final HttpClient CLIENT = HttpClient.newHttpClient();
    public static double getExchange(String from, String to) throws IOException, InterruptedException {

            String URL = String.format("https://api.frankfurter.dev/v1/latest?from=%s&to=%s", from ,to);
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(URL))
                    .GET()
                    .build();
            HttpResponse<String> response = CLIENT.send(request, HttpResponse.BodyHandlers.ofString());

            if(response.statusCode() != 200){
                throw new IOException("Failed: " + response.statusCode());
            }

            JSONObject json = new JSONObject(response.body());
            return json.getJSONObject("rates").getDouble(to);

    }
}
