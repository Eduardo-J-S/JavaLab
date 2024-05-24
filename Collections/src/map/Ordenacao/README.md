# LivrariaOnline

Este projeto é parte do Bootcamp da DIO em parceria com o Santander. Ele implementa uma livraria online que armazena livros utilizando um Map, onde a chave é o link da obra na Amazon Marketplace e o valor é um objeto da classe `Livro`. A classe `Livro` possui atributos como título, autor e preço.

## Funcionalidades

1. **Adicionar um Livro**: Para adicionar um novo livro à livraria, utilize o método `adicionarLivro(String link, String titulo, String autor, double preco)` e forneça o link, título, autor e preço do livro como argumentos.

2. **Remover um Livro**: Para remover um livro da livraria, utilize o método `removerLivro(String titulo)` e forneça o título do livro como argumento.

3. **Exibir Livros Ordenados por Preço**: Para exibir todos os livros da livraria em ordem crescente de preço, utilize o método `exibirLivrosOrdenadosPorPreco()`.

4. **Pesquisar Livros por Autor**: Para retornar uma lista de todos os livros escritos por um determinado autor, utilize o método `pesquisarLivrosPorAutor(String autor)` e forneça o nome do autor como argumento.

5. **Obter o Livro Mais Caro**: Para obter o livro mais caro disponível na livraria, utilize o método `obterLivroMaisCaro()`.

6. **Exibir o Livro Mais Barato**: Para obter o livro mais barato disponível na livraria, utilize o método `exibirLivroMaisBarato()`.
