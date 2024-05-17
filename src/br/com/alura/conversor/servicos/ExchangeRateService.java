package br.com.alura.conversor.servicos;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class ExchangeRateService {
    private static final String apiKey = "fe85bc8a8950311d1ff0e3a0";
    private static final String baseUrl = "https://v6.exchangerate-api.com/v6/";

    public double obterTaxaCambio(String moedaOrigem, String moedaDestino) throws IOException {
        String url = baseUrl + apiKey + "/latest/" + moedaOrigem;
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(url)).build();

        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String respondeBody = response.body();
            JsonObject jsonObject = JsonParser.parseString(respondeBody).getAsJsonObject();
            return jsonObject.getAsJsonObject("rates").get(moedaDestino).getAsDouble();
        } catch (InterruptedException e) {
            throw new IOException("Erro ao obter a taxa de câmbio", e);
        }
    }
}
