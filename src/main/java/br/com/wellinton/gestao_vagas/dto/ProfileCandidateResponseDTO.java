package br.com.wellinton.gestao_vagas.dto;

import java.util.UUID;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProfileCandidateResponseDTO {

    @Schema(example = "Desenvolvedora Java")
    private String description;

    @Schema(example = "Jose")
    private String username;

    @Schema(example = "jose@gmail.com")
    private String email;
    private UUID id;

    @Schema(example = "Jose de souza")
    private String name;
}