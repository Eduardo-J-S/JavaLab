# Desafio de Implementação de Banco

Este projeto foi desenvolvido como parte do Bootcamp da Digital Innovation One (DIO) com o objetivo de criar uma implementação de um sistema bancário robusto, utilizando boas práticas de programação.

## Requisitos do Desafio

O desafio consistia em tornar um pouco mais robusto um sistema bancário. E essas foram as regras de negócio que defini para esse desafio:

1. Ao criar uma conta corrente, automaticamente uma conta poupança vinculada é criada.
2. É possível criar uma conta poupança sem criar uma conta corrente.
3. Adicionar verificações e validações para garantir operações seguras e consistentes.

## Estrutura do Projeto

O projeto está organizado da seguinte maneira:

```
├── src
│   ├── model
│   │   ├── Cliente.java
│   │   ├── Conta.java
│   │   ├── ContaCorrente.java
│   │   ├── ContaPoupanca.java
│   │   └── IConta.java
│   ├── service
│   │   └── BancoService.java
│   └── App.java
├── README.md
└── ...
```


### Classes e Pacotes

- `model`: Contém as classes de modelo do sistema, incluindo `Cliente`, `Conta`, `ContaCorrente`, `ContaPoupanca` e a interface `IConta`.
- `service`: Contém a classe `BancoService`, responsável por gerenciar as operações relacionadas às contas.
- `App.java`: Classe principal que executa o sistema e demonstra as funcionalidades implementadas.

## Melhorias Implementadas

1. **Verificações nos Métodos de Conta**: Adicionadas validações nos métodos `sacar`, `depositar` e `transferir` para garantir que os valores sejam positivos e que não ocorram operações com saldo insuficiente.
2. **Sincronização de Variável Estática**: Utilização de `synchronized` na variável estática `SEQUENCIAL` para garantir incrementos seguros em ambientes multithread.
3. **Método `criarContaCorrente`**: Adicionado método na classe `BancoService` para:
   - Verificar se o cliente já possui uma conta corrente.
   - Verificar se o cliente já possui uma conta poupança e, se existente, realocar seu saldo para a nova conta corrente e conta poupança criada.
4. **Método `criarContaPoupanca`**: Adicionado método na classe `BancoService` para:
    - Verificar se o cliente já possui uma conta poupança.
    - criar uma conta poupança.
## Possíveis Melhorias Futuras

- Implementação de testes unitários para garantir a integridade das funcionalidades.
- Refatoração do código para melhorar a legibilidade e a manutenção.
- Tratamento de exceções mais específico para diferentes tipos de erro.
- Avaliação de mais validações para garantir a integridade dos dados.

## Contribuição
Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e enviar pull requests.

