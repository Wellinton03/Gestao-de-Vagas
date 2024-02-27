package br.com.wellinton.gestao_vagas.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import br.com.wellinton.gestao_vagas.company.entities.CompanyEntity;
import br.com.wellinton.gestao_vagas.company.repositories.CompanyRepository;
import br.com.wellinton.gestao_vagas.exceptions.UserFoundException;

@Service
public class CreateCompanyUseCase {
    
    @Autowired
    private CompanyRepository companyRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public CompanyEntity execute(CompanyEntity companyEntity) {
        
        this.companyRepository
        .findByUsernameOrEmail(companyEntity.getUsername(), companyEntity.getEmail())
        .ifPresent((User) -> {
            throw new UserFoundException();
        });

        var password = passwordEncoder.encode(companyEntity.getPassword());
        companyEntity.setPassword(password);

        return  this.companyRepository.save(companyEntity);
    }
}
