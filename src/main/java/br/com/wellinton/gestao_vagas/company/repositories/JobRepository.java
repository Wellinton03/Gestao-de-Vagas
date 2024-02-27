package br.com.wellinton.gestao_vagas.company.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellinton.gestao_vagas.company.entities.JobEntity;

public interface JobRepository extends JpaRepository<JobEntity, UUID> {

    
}
