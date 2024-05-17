package br.com.alura.conversor.modelos;

public class Moeda {
    private String nome;
    private String codigo;

    public Moeda(String nome, String codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return nome + " (" + codigo + ")";
    }
}
