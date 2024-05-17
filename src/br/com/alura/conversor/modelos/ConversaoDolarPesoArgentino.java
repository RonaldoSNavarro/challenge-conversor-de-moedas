package br.com.alura.conversor.modelos;

public class ConversaoDolarPesoArgentino implements Conversao{
    private final double taxaCambio;

    public ConversaoDolarPesoArgentino(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor * taxaCambio;
    }
}
