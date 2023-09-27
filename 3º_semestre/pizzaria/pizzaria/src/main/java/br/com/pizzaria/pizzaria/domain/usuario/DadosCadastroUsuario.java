package br.com.pizzaria.pizzaria.domain.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosCadastroUsuario(
        @NotNull
        Integer telefone,
        @NotBlank
        String nome,
        @NotBlank
        String bairro,
        @NotBlank
        String cep,
        @NotBlank
        String complemento,
        @NotBlank
        String localidade,
        @NotBlank
        String logradouro,
        @NotBlank
        String uf) {}