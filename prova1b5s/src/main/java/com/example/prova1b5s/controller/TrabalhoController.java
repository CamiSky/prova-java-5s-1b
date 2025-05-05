package com.example.prova1b5s.controller;

import com.example.prova1b5s.model.Pessoa;
import com.example.prova1b5s.model.PessoaDTO;
import com.example.prova1b5s.model.Trabalho;
import com.example.prova1b5s.model.TrabalhoDTO;
import com.example.prova1b5s.service.PessoaService;
import com.example.prova1b5s.service.TrabalhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/trabalho")
public class TrabalhoController {
    @Autowired
    private TrabalhoService trabalhoService;

    @GetMapping
    private ResponseEntity<List<Trabalho>> findAll(){
        List<Trabalho> trabalho = trabalhoService.findAll();
        return ResponseEntity.ok().body(trabalho);
    }

    @PostMapping
    private ResponseEntity<Trabalho> cadastrarPessoa(@RequestBody TrabalhoDTO trabalhoDTO){
        Trabalho response = trabalhoService.cadastrarTrabalho(trabalhoDTO.transformaObj());
        return ResponseEntity.ok().body(response);
    }

    @DeleteMapping("/{id}")
    private ResponseEntity<?> deletar(@PathVariable Long id){
        trabalhoService.deletarTrabalho(id);
        return ResponseEntity.noContent().build();
    }
}
