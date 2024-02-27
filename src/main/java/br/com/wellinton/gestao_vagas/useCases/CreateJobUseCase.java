package br.com.wellinton.gestao_vagas.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.wellinton.gestao_vagas.company.entities.JobEntity;
import br.com.wellinton.gestao_vagas.company.repositories.JobRepository;

@Service
public class CreateJobUseCase {
    
@Autowired
private JobRepository jobRepository;

    public JobEntity execute(JobEntity jobEntity) {
        return this.jobRepository.save(jobEntity);
    }
}
