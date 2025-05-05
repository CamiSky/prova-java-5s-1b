package com.example.prova1b5s.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Trabalho {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private String cargo;

    @OneToMany(mappedBy = "trabalho")
    private List<Pessoa> pessoas;

    public Trabalho(String cargo) {
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setPessoas(List<Pessoa> pessoas) {
        this.pessoas = pessoas;
    }

    public Long getId() {
        return id;
    }

    public String getCargo() {
        return cargo;
    }

    public List<Pessoa> getPessoas() {
        return pessoas;
    }
}
