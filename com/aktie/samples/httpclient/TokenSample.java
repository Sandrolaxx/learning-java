package com.aktie.samples.httpclient;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class TokenSample {

    public static void main(String[] args) {
        System.out.println(getToken());
    }

    public static String getToken() {
        try {
            //Configurando os parâmetros do formulário
            String urlParameters = "client_id=" + URLEncoder.encode("41b44ab9a56440.teste.celcoinapi.v5", StandardCharsets.UTF_8)
                    + "&grant_type=" + URLEncoder.encode("client_credentials", StandardCharsets.UTF_8)
                    + "&client_secret=" + URLEncoder.encode("e9d15cde33024c1494de7480e69b7a18c09d7cd25a8446839b3be82a56a044a3", StandardCharsets.UTF_8);

            //Criando uma instância de HttpClient
            HttpClient client = HttpClient.newHttpClient();

            //Configurando a requisição POST
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://sandbox.openfinance.celcoin.dev/v5/token"))
                    .header("Content-Type", "application/x-www-form-urlencoded")
                    .POST(HttpRequest.BodyPublishers.ofString(urlParameters))
                    .build();

            //Enviando a requisição e obtendo a resposta
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            //Retornando o corpo da resposta
            return response.body();
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

}
