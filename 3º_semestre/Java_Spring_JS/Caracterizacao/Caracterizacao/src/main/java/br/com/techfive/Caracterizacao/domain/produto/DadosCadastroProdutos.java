package br.com.techfive.Caracterizacao.domain.produto;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroProdutos (
        @NotBlank
        String codProduto,
        @NotBlank
        String descricao,
        @NotBlank
        String familiaId
) {}