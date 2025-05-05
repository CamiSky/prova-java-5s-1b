package com.example.prova1b5s.service;

import com.example.prova1b5s.model.Pessoa;
import com.example.prova1b5s.model.PessoaDTO;
import com.example.prova1b5s.model.Trabalho;
import com.example.prova1b5s.repository.PessoaRepository;
import com.example.prova1b5s.repository.TrabalhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {


    @Autowired
    private TrabalhoRepository trabalhoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    public List<Pessoa> findAll(){
        return pessoaRepository.findAll();
    }
    public Pessoa cadastrarPessoa(PessoaDTO dto) {
        Trabalho trabalho = trabalhoRepository.findById(dto.getTrabalhoId())
                .orElseThrow(() -> new RuntimeException("Trabalho não encontrado com id: " + dto.getTrabalhoId()));

        Pessoa pessoa = new Pessoa(dto.getNome(), trabalho);
        return pessoaRepository.save(pessoa);
    }
    public void deletarCadastro(Long id){
        pessoaRepository.deleteById(id);
    }
}
