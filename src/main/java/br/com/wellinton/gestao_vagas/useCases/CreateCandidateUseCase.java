package br.com.wellinton.gestao_vagas.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wellinton.gestao_vagas.candidate.CandidateEntity;
import br.com.wellinton.gestao_vagas.candidate.CandidateRepository;
import br.com.wellinton.gestao_vagas.exceptions.UserFoundException;

@Service
public class CreateCandidateUseCase {
    @Autowired
    private CandidateRepository candidateRepository;


    public CandidateEntity execute(CandidateEntity candidateEntity) {
    this.candidateRepository
    .findByUsernameOrEmail(candidateEntity.getUsername(), candidateEntity.getEmail())
    .ifPresent((user) -> {
        throw new UserFoundException();
    });
    return this.candidateRepository.save(candidateEntity);
}
}

