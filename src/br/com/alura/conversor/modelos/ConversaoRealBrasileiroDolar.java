package br.com.alura.conversor.modelos;

public class ConversaoRealBrasileiroDolar implements Conversao {
    private final double taxaCambio;

    public ConversaoRealBrasileiroDolar(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor / taxaCambio;
    }
}
