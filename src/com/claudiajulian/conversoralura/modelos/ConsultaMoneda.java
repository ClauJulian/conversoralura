package com.claudiajulian.conversoralura.modelos;

import com.google.gson.Gson;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsultaMoneda {

    URI direccion = URI.create("https://v6.exchangerate-api.com/v6/622abbbbfad52f40bd2b40a1/latest/");

    public Coin buscaMoneda(String base_code){
        URI direccion = URI.create("https://v6.exchangerate-api.com/v6/622abbbbfad52f40bd2b40a1/latest/" + base_code);

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(direccion)
                .build();

        HttpResponse<String> response = null;
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException |InterruptedException e) {
            throw new RuntimeException(e);
        }

        return new Gson().fromJson(response.body(), Coin.class);
    }
}
