package Atividade;

import java.time.LocalDateTime;

public class Tarefa {
    private String titulo;
    private String descricao;
    private int prioridade;
    private LocalDateTime prazo;

    public Tarefa(String titulo, int prioridade) {
        this.titulo = titulo;
        this.descricao = "Descricao Padrao";   
        this.prazo = LocalDateTime.now();          
        setPrioridade(prioridade); 
    }

    private boolean isPrioridadeValida(int prioridade) {
        return prioridade >= 1 && prioridade <= 5;
    }

    private void setPrioridade(int prioridade) {
        if (isPrioridadeValida(prioridade)) {
            this.prioridade = prioridade;
        } else {
            throw new IllegalArgumentException("A prioridade deve ser um valor entre 1 e 5.");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public LocalDateTime getPrazo() {
        return prazo;
    }
}
