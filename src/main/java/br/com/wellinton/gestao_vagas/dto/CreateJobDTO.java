package br.com.wellinton.gestao_vagas.dto;

import lombok.Data;

@Data
public class CreateJobDTO {

    private String description;
    private String benefits;
    private String level;
    
}
