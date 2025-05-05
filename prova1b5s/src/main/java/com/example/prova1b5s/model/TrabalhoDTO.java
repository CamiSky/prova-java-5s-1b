package com.example.prova1b5s.model;

public class TrabalhoDTO {
    private String cargo;

    public Trabalho transformaObj() {
        return new Trabalho(cargo);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
