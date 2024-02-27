package br.com.wellinton.gestao_vagas.company.repositories;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.wellinton.gestao_vagas.company.entities.CompanyEntity;

public interface CompanyRepository extends JpaRepository<CompanyEntity,UUID> {
    Optional <CompanyEntity> findByUsernameOrEmail(String username, String email);

    Optional<CompanyEntity> findByusername(String username);
}
