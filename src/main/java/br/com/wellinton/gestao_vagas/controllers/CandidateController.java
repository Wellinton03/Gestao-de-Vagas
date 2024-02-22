package br.com.wellinton.gestao_vagas.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wellinton.gestao_vagas.candidate.CandidateEntity;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/candidate")
public class CandidateController {
    
    @PostMapping("/")
    public void create( @Valid @RequestBody CandidateEntity candidateEntity) {
        System.out.println("candidato");
        System.out.println(candidateEntity.getEmail());
    }
}
