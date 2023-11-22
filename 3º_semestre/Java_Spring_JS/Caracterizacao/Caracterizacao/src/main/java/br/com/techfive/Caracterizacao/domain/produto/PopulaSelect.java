package br.com.techfive.Caracterizacao.domain.produto;

import jakarta.validation.constraints.NotBlank;

public record PopulaSelect(
        @NotBlank
        String descricao,
        @NotBlank
        String cod_produto) {
}
