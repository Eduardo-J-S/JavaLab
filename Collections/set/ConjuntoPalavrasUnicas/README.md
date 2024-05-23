# Exercício DIO Santander - Conjunto de Palavras Únicas

Este é um exercício proposto pela Digital Innovation One (DIO) em parceria com o Banco Santander. O objetivo é implementar uma classe `UniqueWordsSet` em Java que represente um conjunto de palavras únicas, utilizando a estrutura de dados `HashSet`.

## Descrição

A classe `UniqueWordsSet` possui os seguintes métodos:

1. **addWord(String word)**: Adiciona uma palavra única ao conjunto.
2. **removeWord(String word)**: Remove uma palavra do conjunto, se estiver presente.
3. **containsWord(String word)**: Verifica se uma palavra está presente no conjunto.
4. **displayUniqueWords()**: Exibe todas as palavras únicas do conjunto.

## Exemplo de Uso

```java
public class App {
    public static void main(String[] args) {
        UniqueWordsSet set = new UniqueWordsSet();

        // Adicionando palavras ao conjunto
        set.addWord("word1");
        set.addWord("word2");
        set.addWord("word3");
        set.addWord("word3");
        
        // Verificando palavras no conjunto
        System.out.println("Contém 'word1': " + set.containsWord("word1")); // true
        System.out.println("Contém 'word4': " + set.containsWord("word4")); // false

        // Exibindo todas as palavras únicas
        System.out.println("Palavras únicas: " + set.displayUniqueWords());

        // Removendo uma palavra do conjunto
        set.removeWord("word2");
        System.out.println("Palavras únicas após remoção: " + set.displayUniqueWords());
    }
}
```

## Saída Esperada

```
Contém 'word1': true
Contém 'word4': false
Palavras únicas: [word2, word1, word3]   
Palavras únicas após remoção: [word1, word3]
```
