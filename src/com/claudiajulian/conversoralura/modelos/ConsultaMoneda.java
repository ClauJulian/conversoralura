package com.claudiajulian.conversoralura.modelos;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {


    public Coin buscaMoneda(String base_code){

        String URL_BASE = "https://v6.exchangerate-api.com/v6/";
        String API_KEY = "622abbbbfad52f40bd2b40a1/";
        String PARAM_1 = "latest/";

        URI direccion = URI.create(URL_BASE + API_KEY + PARAM_1 + base_code);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();
        HttpResponse<String> response = null;


        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
        return new Gson().fromJson(response.body(), Coin.class);
    }
}
