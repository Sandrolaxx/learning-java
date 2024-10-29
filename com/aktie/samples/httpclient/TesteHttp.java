package com.aktie.samples.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class TesteHttp {
    public static void main(String[] args) {
        try {
            String response = getJsonData();

            System.out.println(response);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getJsonData() throws IOException, InterruptedException {
        //Criando instância de HttpClient
        HttpClient client = HttpClient.newHttpClient();

        //Criando a requisição com o método GET e a URL alvo
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://economia.awesomeapi.com.br/json/last/USD"))
                .GET()
                .build();

        //Enviando a requisição e obtendo a resposta
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        //Retornando o corpo da resposta como String
        return response.body();
    }
}