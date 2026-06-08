package br.com.daniel.localizacep.app;

import br.com.daniel.localizacep.exception.CepInvalidoException;
import br.com.daniel.localizacep.model.Endereco;
import br.com.daniel.localizacep.service.ConsumoApi;

import java.util.Scanner;

public class Menu {
    private final Scanner leitura = new Scanner(System.in);
    private final ConsumoApi consumoApi = new ConsumoApi();

    public void exibeMenu() {
        boolean isLeave = false;
        while (!isLeave) {
            System.out.println("""
                    =======================================================
                    Bem-vindo ao LOCALIZA C.E.P!
                    Você pode consultar o CEP válido residente do BRASIL.
                    =======================================================
                    INSTRUÇÕES:
                    DIGITE [0] PARA SAIR.
                    """);
            System.out.println("Digite um CEP:");
            String cep = leitura.nextLine();
            String verifiy = cep;
            if (verifiy.length() < 2 & verifiy.contains("0")) {
                System.out.println("Saindo...");
                break;
            }
            try {

                Endereco endereco = consumoApi.consultaCep(cep);
                System.out.println(endereco);

            } catch (CepInvalidoException e) {

                System.out.println("Erro: " + e.getMessage());

            }
        }
    }
}
