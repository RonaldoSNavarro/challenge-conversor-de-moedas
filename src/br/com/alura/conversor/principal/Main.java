package br.com.alura.conversor.principal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int escolha = 0;

        String menu = """
                 ****************************************************
                 $$ Seja bem vindo(a) ao Conversor de Moedas $$
                                
                 1- Dólar >> Peso argentino
                 2- Peso argentino >> Dólar
                 3- Dólar >> Real brasileiro
                 4- Real brasileiro >> Dólar
                 5- Dólar >> Peso colombiano
                 6- Peso colombiano >> Dólar
                 7- Sair
                 
                 Escolha uma opção válida: 
                 ****************************************************
                """;

        while (escolha != 7) {

            // Menu de operações
            System.out.println(menu);

            // Solicitando a escolha do usuário
            System.out.println("\nDigite o valor que deseja converter: ");
            escolha = leitura.nextInt();

            switch (escolha) {

                case 1:

                    break;

                case 2:

                    break;

                case 3:

                    break;

                case 4:
                    System.out.println("Programa encerrado com sucesso");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente!");

            }
        }


    }
}