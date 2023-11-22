package br.com.techfive.Caracterizacao.domain.familiaDeMaterial;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroFamiliaDeMaterial(
        @NotBlank
        String codigo,
        @NotBlank
        String descricao
){}
