package br.com.alura.conversor.modelos;

public class ConversaoPesoArgentinoDolar implements Conversao {
    private final double taxaCambio;

    public ConversaoPesoArgentinoDolar(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor / taxaCambio;
    }
}
