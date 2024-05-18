package br.com.alura.conversor.principal;

import br.com.alura.conversor.modelos.*;
import br.com.alura.conversor.servicos.ExchangeRateService;

import java.io.IOException;
import java.util.Scanner;

public class ConversorDeMoedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExchangeRateService exchangeRateService = new ExchangeRateService();

        while (true) {
            String menu = """
            
            ****************************************************
            
            $$ Seja bem-vindo(a) ao Conversor de Moedas $$
            
            1- Dólar >> Peso argentino
            2- Peso argentino >> Dólar
            3- Dólar >> Real brasileiro
            4- Real brasileiro >> Dólar
            5- Dólar >> Peso colombiano
            6- Peso colombiano >> Dólar
            "7- Sair
            
            ****************************************************
            
            """;
            System.out.println(menu);
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 7) {
                System.out.println("Saindo...");
                break;
            }

            Conversao conversao;
            double taxaCambio;

            try {
                switch (opcao) {
                    case 1:
                        taxaCambio = exchangeRateService.obterTaxaCambio("USD", "ARS");
                        conversao = new ConversaoDolarPesoArgentino(taxaCambio);
                        break;
                    case 2:
                        taxaCambio = exchangeRateService.obterTaxaCambio("ARS", "USD");
                        conversao = new ConversaoPesoArgentinoDolar(taxaCambio);
                        break;
                    case 3:
                        taxaCambio = exchangeRateService.obterTaxaCambio("USD", "BRL");
                        conversao = new ConversaoDolarRealBrasileiro(taxaCambio);
                        break;
                    case 4:
                        taxaCambio = exchangeRateService.obterTaxaCambio("BRL", "USD");
                        conversao = new ConversaoRealBrasileiroDolar(taxaCambio);
                        break;
                    case 5:
                        taxaCambio = exchangeRateService.obterTaxaCambio("USD", "COP");
                        conversao = new ConversaoDolarPesoColombiano(taxaCambio);
                        break;
                    case 6:
                        taxaCambio = exchangeRateService.obterTaxaCambio("COP", "USD");
                        conversao = new ConversaoPesoColombianoDolar(taxaCambio);
                        break;
                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                        continue;
                }

                System.out.print("Digite o valor a ser convertido: ");
                double valor = scanner.nextDouble();
                scanner.nextLine();

                double valorConvertido = conversao.converter(valor);
                System.out.println("****************************************************");
                System.out.printf("Valor convertido: %.2f%n", valorConvertido);
            } catch (IOException e) {
                System.out.println("Erro ao obter a taxa de câmbio: " + e.getMessage());
            }
        }
    }
}
