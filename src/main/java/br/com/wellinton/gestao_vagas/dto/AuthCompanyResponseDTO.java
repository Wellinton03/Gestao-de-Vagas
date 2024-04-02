package br.com.wellinton.gestao_vagas.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class AuthCompanyResponseDTO {
    

    private String access_token;
    private Long expires_in;
}
