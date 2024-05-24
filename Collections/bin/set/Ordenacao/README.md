# Gerenciador de Alunos

Este projeto é um exercício do bootcamp da Digital Innovation One (DIO) em parceria com o Santander. O objetivo é praticar a criação e manipulação de conjuntos de objetos em Java, utilizando conceitos de collections, comparators e ordenação.

## Descrição

A aplicação Gerenciador de Alunos permite gerenciar uma lista de alunos com os seguintes atributos: nome, matrícula e média. A classe `GerenciadorAlunos` fornece métodos para adicionar, remover e exibir alunos de diferentes maneiras.

## Funcionalidades

- **Adicionar Aluno**: Adiciona um aluno ao conjunto.
- **Remover Aluno**: Remove um aluno do conjunto com base na matrícula.
- **Exibir Alunos por Nome**: Exibe todos os alunos do conjunto em ordem alfabética pelo nome.
- **Exibir Alunos por Nota**: Exibe todos os alunos do conjunto em ordem crescente de nota.
- **Exibir Todos os Alunos**: Exibe todos os alunos do conjunto.

## Estrutura do Projeto

O projeto contém as seguintes classes:

- `GerenciadorAlunos`: Gerencia o conjunto de alunos.
- `Aluno`: Representa um aluno com nome, matrícula e média.
- `ComparatorPorNota`: Comparator para ordenar alunos pela média.

## Exemplo de Uso

Aqui está um exemplo de uso da aplicação:

```java
public class App {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent("João", 123L, 7.5);
        manager.addStudent("Maria", 456L, 8.9);
        manager.addStudent("Pedro", 789L, 6.4);
        manager.addStudent("Mario", 789L, 6.4);

        System.out.println("All students:");
        manager.displayStudents();

        System.out.println("\nStudents by name:");
        System.out.println(manager.displayStudentsByName());

        System.out.println("\nStudents by grade:");
        System.out.println(manager.displayStudentsByGrade());

        manager.removeStudent(456L);
        System.out.println("\nAll students after removal:");
        manager.displayStudents();
    }
}
