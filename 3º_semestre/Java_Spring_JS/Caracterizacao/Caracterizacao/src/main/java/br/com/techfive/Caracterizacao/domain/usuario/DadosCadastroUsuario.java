package br.com.techfive.Caracterizacao.domain.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(
        @NotBlank
        String email,
        @NotBlank
        String senha,
        @NotBlank
        String nome,
        @NotNull
        Cargo cargo) {}
