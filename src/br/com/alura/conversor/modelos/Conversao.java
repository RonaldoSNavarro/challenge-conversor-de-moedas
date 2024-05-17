package br.com.alura.conversor.modelos;

public abstract class Conversao implements Conversivel{
    private Moeda moedaOrigem;
    private Moeda moedaDestino;
    private double taxaCambio;

    public Conversao(Moeda moedaOrigem, Moeda moedaDestino, double taxaCambio) {
        this.moedaOrigem = moedaOrigem;
        this.moedaDestino = moedaDestino;
        this.taxaCambio = taxaCambio;
    }

    @Override
    public double converter(double valor, double taxaCambio) {
        return valor * taxaCambio;
    }

    public Moeda getMoedaOrigem() {
        return moedaOrigem;
    }

    public Moeda getMoedaDestino() {
        return moedaDestino;
    }

    public double getTaxaCambio() {
        return taxaCambio;
    }
}
