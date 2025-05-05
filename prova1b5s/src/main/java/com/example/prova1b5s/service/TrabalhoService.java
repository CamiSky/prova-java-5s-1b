package com.example.prova1b5s.service;

import com.example.prova1b5s.model.Trabalho;
import com.example.prova1b5s.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrabalhoService {

    @Autowired
    private TrabalhoRepository trabalhoRepository;

    public List<Trabalho> findAll(){
        return trabalhoRepository.findAll();
    }
    public Trabalho cadastrarTrabalho(Trabalho trabalho){
        return trabalhoRepository.save(trabalho);
    }
    public void deletarTrabalho(Long id){
        trabalhoRepository.deleteById(id);
    }
}
