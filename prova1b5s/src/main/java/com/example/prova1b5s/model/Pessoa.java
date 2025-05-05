package com.example.prova1b5s.model;

import jakarta.persistence.*;

@Entity
public class Pessoa {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String nome;

    @ManyToOne
    @JoinColumn(name = "trabalho_id")
    private Trabalho trabalho;

    public Pessoa(String nome, Trabalho cargoTrabalho) {
        this.nome = nome;
        this.trabalho = cargoTrabalho;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Trabalho getTrabalho() {
        return trabalho;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTrabalho(Trabalho trabalho) {
        this.trabalho = trabalho;
    }
}
