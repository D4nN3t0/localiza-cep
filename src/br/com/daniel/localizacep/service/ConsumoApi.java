package br.com.daniel.localizacep.service;

import br.com.daniel.localizacep.exception.CepInvalidoException;
import br.com.daniel.localizacep.model.Endereco;
import com.google.gson.Gson;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConsumoApi {
    public Endereco consultaCep(String cep) {
        URI endereco = URI.create("https://viacep.com.br/ws/" + cep + "/json/");
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(endereco)
                .build();
        HttpResponse<String> response = null;
        if (cep.length() != 8) {
            throw new CepInvalidoException("O CEP deve conter exatamente 8 dígitos.");
        }
        try {
            response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Não foi possível obter o endereço a partir desse CEP.");
        } catch (CepInvalidoException e) {
            System.out.println("Error: "+e.getMessage());
        }
        finally {
            System.out.println("Operação finalizada.");
        }
        var json = response.body();

        return new Gson().fromJson(json, Endereco.class);
    }
}
