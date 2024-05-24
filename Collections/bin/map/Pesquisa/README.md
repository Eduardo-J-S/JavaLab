# Contagem de Palavras

Este repositório contém a implementação de uma classe `WordCount` como parte de um exercício do bootcamp da DIO em parceria com o Santander. O objetivo é armazenar palavras e suas contagens em um texto, utilizando um `Map` para facilitar a manipulação dos dados.

## Funcionalidades

A classe `WordCount` oferece as seguintes funcionalidades:

1. **Adicionar uma Palavra**: Para adicionar uma nova palavra ao mapa de contagens, utilize o método `addWord(String word)`. A palavra será adicionada com contagem inicial de 1, ou terá sua contagem incrementada se já existir no mapa.

2. **Remover uma Palavra**: Para remover uma palavra do mapa, utilize o método `removeWord(String word)`. Se a palavra não estiver presente, uma mensagem será exibida.

3. **Exibir Contagem de Palavras**: Para exibir todas as palavras e suas contagens, utilize o método `displayWordCount()`. Será lançada uma exceção se o mapa estiver vazio.

4. **Encontrar a Palavra Mais Frequente**: Para encontrar a palavra mais frequente no mapa, utilize o método `findMostFrequentWord()`. Será lançada uma exceção se o mapa estiver vazio.

