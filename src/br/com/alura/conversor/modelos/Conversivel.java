package br.com.alura.conversor.modelos;

public interface Conversivel {
    int getClassificacao();
    double converter(double valor, double taxaCambio);
}
