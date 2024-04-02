package br.com.wellinton.gestao_vagas.candidate.repository;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellinton.gestao_vagas.candidate.entity.ApplyJobEntity;

public interface ApplyJobRepository extends JpaRepository<ApplyJobEntity, UUID> {

}

