# CarrinhoDeCompras

Este projeto implementa um sistema simples de carrinho de compras como parte de um exercicio de List do bootcamp Santander DIO. O carrinho de compras permite aos usuários adicionar, remover, exibir itens e calcular o valor total dos itens no carrinho.

## Classes

### CarrinhoDeCompras

- `CarrinhoDeCompras()`: Construtor para inicializar o carrinho de compras.
- `adicionarItem(String nome, double preco, int quantidade)`: Adiciona um item ao carrinho. Se o item já existir, atualiza a quantidade.
- `removerItem(String nome)`: Remove todos os itens com o nome especificado do carrinho.
- `calcularValorTotal()`: Calcula e retorna o valor total dos itens no carrinho.
- `exibirItens()`: Exibe todos os itens no carrinho.

### Item

- `Item(String nome, double preco, int quantidade)`: Construtor para inicializar o item com o nome, preço e quantidade especificados.
- `getNome()`: Retorna o nome do item.
- `getPreco()`: Retorna o preço do item.
- `getQuantidade()`: Retorna a quantidade do item.
- `setQuantidade(int quantidade)`: Define a quantidade do item.

## Exemplo de Uso

```java
public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinho.adicionarItem("Maçã", 0.99, 5);
        carrinho.adicionarItem("Banana", 0.59, 3);
        carrinho.adicionarItem("Laranja", 1.29, 2);

        // Exibindo itens no carrinho
        carrinho.exibirItens();

        // Calculando o valor total do carrinho
        System.out.println("Valor Total: R$ " + carrinho.calcularValorTotal());

        // Removendo um item do carrinho
        carrinho.removerItem("Banana");

        // Exibindo itens no carrinho após a remoção
        carrinho.exibirItens();
    }
}
