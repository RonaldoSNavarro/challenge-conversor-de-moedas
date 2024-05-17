package br.com.alura.conversor.modelos;

public class ConversaoDolarPesoColombiano implements Conversao {
    private final double taxaCambio;

    public ConversaoDolarPesoColombiano(double taxaCambio) {
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor) {
        return valor * taxaCambio;
    }
}
