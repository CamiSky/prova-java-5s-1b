package com.example.prova1b5s.model;

import com.example.prova1b5s.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class PessoaDTO {
    private String nome;
    private Long trabalhoId;

    public PessoaDTO(String nome, Long trabalhoId) {

        this.nome = nome;
        this.trabalhoId = trabalhoId;
    }


    public Pessoa transformaObj() {
        return new Pessoa(nome, trabalhoId);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getTrabalhoId() {
        return trabalhoId;
    }

    public void setTrabalhoId(Long trabalhoId) {
        this.trabalhoId = trabalhoId;
    }
}
