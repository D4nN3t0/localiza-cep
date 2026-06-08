package br.com.daniel.localizacep.model;

public record Endereco(String cep, String logradouro, String complemento, String localidade, String uf) {
    @Override
    public String toString() {
        String complementoFormatado =
                complemento.isBlank()
                        ? "Não informado"
                        : complemento;
        return """
                
                ==============================
                ENDEREÇO ENCONTRADO
                ==============================
                CEP: %s
                LOGRADOURO: %s
                COMPLEMENTO: %s
                CIDADE: %s
                UF: %s
                ==============================
                """.formatted(
                cep,
                logradouro,
                complementoFormatado,
                localidade,
                uf
        );
    }
}
