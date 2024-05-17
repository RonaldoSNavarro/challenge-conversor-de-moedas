package br.com.alura.conversor.modelos;

public class ConversaoPesoColombianoDolar implements Conversao {
    private final double taxaCambio;

    public ConversaoPesoColombianoDolar(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor / taxaCambio;
    }
}
