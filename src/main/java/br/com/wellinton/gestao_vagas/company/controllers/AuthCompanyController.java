package br.com.wellinton.gestao_vagas.company.controllers;

import javax.naming.AuthenticationException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.wellinton.gestao_vagas.dto.AuthCompanyDTO;
import br.com.wellinton.gestao_vagas.useCases.AuthCompanyUseCase;

@RestController
@RequestMapping("/auth")
public class AuthCompanyController { 
    
    @Autowired
    private AuthCompanyUseCase authCompanyUseCase;

    @PostMapping("/company")
    public String create(@RequestBody AuthCompanyDTO authCompanyDTO) throws AuthenticationException {
        return this.authCompanyUseCase.execute(authCompanyDTO);
    }
}
