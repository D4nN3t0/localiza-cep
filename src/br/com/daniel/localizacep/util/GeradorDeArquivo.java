package br.com.daniel.localizacep.util;

import br.com.daniel.localizacep.model.Endereco;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;

public class GeradorDeArquivo {
    public void salvarJson (Endereco endereco) {
        Gson gson = new GsonBuilder()
                .setPrettyPrinting()
                .create();

        try {

            FileWriter escrita =
                    new FileWriter(endereco.cep() + ".json");

            escrita.write(gson.toJson(endereco));
            escrita.close();

            System.out.println("Arquivo JSON gerado com sucesso.");

        } catch (IOException e) {

            throw new RuntimeException("Não foi possível gerar o arquivo.");

        }
    }
}
