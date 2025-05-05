package com.example.prova1b5s.controller;


import com.example.prova1b5s.model.Pessoa;
import com.example.prova1b5s.model.PessoaDTO;
import com.example.prova1b5s.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaController {
    @Autowired
    private PessoaService pessoaService;

    @GetMapping
    private ResponseEntity<List<Pessoa>> findAll(){
        List<Pessoa> pessoa = pessoaService.findAll();
        return ResponseEntity.ok().body(pessoa);
    }

    @PostMapping
    private ResponseEntity<Pessoa> cadastrarPessoa(@RequestBody PessoaDTO pessoaDTO){
        Pessoa response = pessoaService.cadastrarPessoa(pessoaDTO);
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> deletar(@PathVariable Long id){
        pessoaService.deletarCadastro(id);
        return ResponseEntity.noContent().build();
    }

}
