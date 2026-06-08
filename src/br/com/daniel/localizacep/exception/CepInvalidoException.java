package br.com.daniel.localizacep.exception;

public class CepInvalidoException extends RuntimeException {
    public CepInvalidoException(String message) {
        super(message);
    }
}
