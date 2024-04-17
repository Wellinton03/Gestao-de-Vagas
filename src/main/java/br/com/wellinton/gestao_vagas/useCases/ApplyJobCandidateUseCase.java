package br.com.wellinton.gestao_vagas.useCases;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wellinton.gestao_vagas.candidate.CandidateRepository;
import br.com.wellinton.gestao_vagas.candidate.entity.ApplyJobEntity;
import br.com.wellinton.gestao_vagas.candidate.repository.ApplyJobRepository;
import br.com.wellinton.gestao_vagas.company.repositories.JobRepository;
import br.com.wellinton.gestao_vagas.exceptions.JobNotFoundException;
import br.com.wellinton.gestao_vagas.exceptions.UserNotFoundException;

@Service
public class ApplyJobCandidateUseCase {

    @Autowired
    private CandidateRepository candidateRepository;

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private ApplyJobRepository applyJobRepository;

    // ID do Candidato
    // ID da vaga
    public ApplyJobEntity execute(UUID idCandidate, UUID idJob) {
        // Validar se candidato existe
        this.candidateRepository.findById(idCandidate)
                .orElseThrow(() -> {
                    throw new UserNotFoundException();
                });

        // Validar se a vaga existe
        this.jobRepository.findById(idJob)
                .orElseThrow(() -> {
                    throw new JobNotFoundException();
                });

        // Candidato se inscrever na vaga
        var applyJob = ApplyJobEntity.builder()
                .candidateId(idCandidate)
                .jobId(idJob).build();

        applyJob = applyJobRepository.save(applyJob);
        return applyJob;
    }
}