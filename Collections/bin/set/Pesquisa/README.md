# Gerenciamento de Lista de Tarefas

Este é um programa simples em Java desenvolvido como parte do bootcamp da Digital Innovation One (DIO) em parceria com o Santander.

## Descrição

O programa de **Gerenciamento de Lista de Tarefas** permite que os usuários gerenciem uma lista de tarefas. Cada tarefa possui uma descrição e um status indicando se foi concluída ou não. Os usuários podem realizar várias operações, como adicionar tarefas, remover tarefas, marcar tarefas como concluídas ou pendentes e exibir tarefas.

## Recursos

- Adicionar uma nova tarefa à lista.
- Remover uma tarefa da lista.
- Exibir todas as tarefas na lista.
- Contar o número total de tarefas na lista.
- Obter um conjunto de tarefas concluídas.
- Obter um conjunto de tarefas pendentes.
- Marcar uma tarefa como concluída.
- Marcar uma tarefa como pendente.
- Limpar toda a lista de tarefas.

## Uso

1. **Adicionar uma Tarefa**: Para adicionar uma nova tarefa à lista, utilize o método `addTask()` e forneça a descrição da tarefa como argumento.

2. **Remover uma Tarefa**: Para remover uma tarefa da lista, utilize o método `removeTask()` e forneça a descrição da tarefa como argumento.

3. **Exibir Tarefas**: Para exibir todas as tarefas na lista, utilize o método `displayTasks()`.

4. **Contar Tarefas**: Para contar o número total de tarefas na lista, utilize o método `countTasks()`.

5. **Obter Tarefas Concluídas**: Para obter um conjunto de tarefas concluídas, utilize o método `getCompletedTasks()`.

6. **Obter Tarefas Pendentes**: Para obter um conjunto de tarefas pendentes, utilize o método `getPendingTasks()`.

7. **Marcar Tarefa como Concluída**: Para marcar uma tarefa como concluída, utilize o método `markTaskCompleted()` e forneça a descrição da tarefa como argumento.

8. **Marcar Tarefa como Pendente**: Para marcar uma tarefa como pendente, utilize o método `markTaskPending()` e forneça a descrição da tarefa como argumento.

9. **Limpar Lista de Tarefas**: Para limpar toda a lista de tarefas, utilize o método `clearTaskList()`.

## Exemplo

```java
public class App {
    public static void main(String[] args) {
        TaskListManager taskListManager = new TaskListManager();
        try {
            taskListManager.addTask("Tarefa 1");
            taskListManager.addTask("Tarefa 2");
            taskListManager.addTask("Tarefa 3");
            taskListManager.displayTasks();
            
            taskListManager.removeTask("Tarefa");
    
            taskListManager.removeTask("Tarefa 1");

            taskListManager.displayTasks();
            System.out.println("----------------------------------");
            System.out.println(taskListManager.countTasks());

            taskListManager.markTaskCompleted("Tarefa 1");

            taskListManager.markTaskCompleted("Tarefa 2");

            System.out.println(taskListManager.getCompletedTasks());
            System.out.println(taskListManager.getPendingTasks());

            taskListManager.markTaskPending("Tarefa 1");

            System.out.println(taskListManager.getCompletedTasks());
            System.out.println(taskListManager.getPendingTasks());

            taskListManager.clearTaskList();

            
            taskListManager.displayTasks();
            
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}
