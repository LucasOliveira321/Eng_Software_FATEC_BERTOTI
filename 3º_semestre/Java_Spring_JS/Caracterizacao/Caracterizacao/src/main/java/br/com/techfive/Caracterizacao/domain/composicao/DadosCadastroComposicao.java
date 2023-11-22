package br.com.techfive.Caracterizacao.domain.composicao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroComposicao (
        @NotNull
        Integer idCaracterizacao,
        @NotBlank
        String idUsuario
){}