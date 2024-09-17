package Atividade;

public class Main {
    public static void main(String[] args) {
        try {
            Tarefa tarefa = new Tarefa("Estudar para prova", 3);
            System.out.println("Tarefa criada: " + tarefa.getTitulo() + ", Prioridade: " + tarefa.getPrioridade());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}