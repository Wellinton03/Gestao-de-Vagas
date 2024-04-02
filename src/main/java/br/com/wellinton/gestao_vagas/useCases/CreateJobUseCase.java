package br.com.wellinton.gestao_vagas.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import br.com.wellinton.gestao_vagas.company.entities.JobEntity;
import br.com.wellinton.gestao_vagas.company.repositories.CompanyRepository;
import br.com.wellinton.gestao_vagas.company.repositories.JobRepository;
import br.com.wellinton.gestao_vagas.exceptions.CompanyNotFoundException;

@Service
public class CreateJobUseCase {

    @Autowired
    private JobRepository jobRepository;

    @Autowired
    private CompanyRepository companyRepository;

    public JobEntity execute(JobEntity jobEntity) {
        companyRepository.findById(jobEntity.getCompanyId()).orElseThrow(() -> {
            throw new CompanyNotFoundException();
        });
        return this.jobRepository.save(jobEntity);
    }
}
