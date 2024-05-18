## 🔖 Sobre

# Conversor de Moedas

![Badge](assets/Badge-Conversor.png)

Este é um simples aplicativo de linha de comando em Java para conversão de moedas. Ele permite que os usuários convertam entre diferentes moedas, como Dólar, Real Brasileiro, Peso Argentino e Peso Colombiano.

## Funcionalidades

- Conversão entre Dólar e Peso Argentino
- Conversão entre Peso Argentino e Dólar
- Conversão entre Dólar e Real Brasileiro
- Conversão entre Real Brasileiro e Dólar
- Conversão entre Dólar e Peso Colombiano
- Conversão entre Peso Colombiano e Dólar

## Pré-requisitos

- JDK (Java Development Kit) instalado no ambiente
- Biblioteca Gson para manipulação de JSON

## Compilação e Execução

1. Clone o repositório para o seu computador.
2. Compile o projeto utilizando o comando `javac`:
    ```
    javac -d bin src/br/com/alura/conversor/principal/*.java src/br/com/alura/conversor/modelos/*.java src/br/com/alura/conversor/servicos/*.java
    ```
3. Execute o aplicativo compilado com o comando `java`:
    ```
    java -cp bin br.com.alura.conversor.principal.ConversorDeMoedas
    ```

## Documentação das Classes

### `ConversorDeMoedas`

Esta classe contém o ponto de entrada do programa e é responsável por exibir o menu de opções para o usuário e processar a entrada dele.

### `ExchangeRateService`

Esta classe é responsável por realizar chamadas à API de taxa de câmbio e obter as taxas de conversão atualizadas entre diferentes moedas.

### `Conversao`

Esta é uma interface que define um contrato para as classes de conversão de moedas. Implementações dessa interface devem fornecer um método `converter` para realizar a conversão de valores.

### `ConversaoDolarParaPesoArgentino`

Esta classe implementa a interface `Conversao` e fornece uma implementação para a conversão de Dólar para Peso Argentino.

### `ConversaoPesoArgentinoParaDolar`

Esta classe implementa a interface `Conversao` e fornece uma implementação para a conversão de Peso Argentino para Dólar.

### `ConversaoDolarParaReal`

Esta classe implementa a interface `Conversao` e fornece uma implementação para a conversão de Dólar para Real Brasileiro.

### `ConversaoRealParaDolar`

Esta classe implementa a interface `Conversao` e fornece uma implementação para a conversão de Real Brasileiro para Dólar.

### `ConversaoDolarParaPesoColombiano`

Esta classe implementa a interface `Conversao` e fornece uma implementação para a conversão de Dólar para Peso Colombiano.

### `ConversaoPesoColombianoParaDolar`

Esta classe implementa a interface `Conversao` e fornece uma implementação para a conversão de Peso Colombiano para Dólar.

## Divisão dos Pacotes

O projeto está dividido em três pacotes principais:

- `br.com.alura.conversor.principal`: Contém a classe principal do programa.
- `br.com.alura.conversor.modelos`: Contém as classes que representam os modelos de conversão de moedas.
- `br.com.alura.conversor.servicos`: Contém a classe responsável por realizar chamadas à API de taxa de câmbio.

## Técnicas Utilizadas

- Modularidade: O projeto está dividido em pacotes e classes para facilitar a organização e manutenção do código.
- Orientação a Objetos: Princípios de OOP são seguidos para criar classes que representam objetos do mundo real e encapsulam comportamentos e dados relacionados.
- Interfaces: O uso de interfaces permite a implementação de contratos comuns, como a interface `Conversao`, que permite acesso uniforme às diferentes implementações de conversão de moedas.
- Tratamento de Exceções: O projeto trata exceções de forma adequada para lidar com situações inesperadas durante a execução do programa.
- Utilização de API Externa: A integração com a API de taxa de câmbio é feita para obter as taxas de conversão atualizadas entre diferentes moedas.

# Desenvolvedor

[<img loading="lazy" src="https://avatars.githubusercontent.com/u/134724019?v=4" width=115><br><sub>Ronaldo Navarro</sub>](https://github.com/ronaldosnavarro)
