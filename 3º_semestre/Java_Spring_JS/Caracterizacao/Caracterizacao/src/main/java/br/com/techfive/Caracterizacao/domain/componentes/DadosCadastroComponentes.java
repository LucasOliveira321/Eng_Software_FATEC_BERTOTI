package br.com.techfive.Caracterizacao.domain.componentes;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record DadosCadastroComponentes(
        @NotNull
        Integer idComposicao,
        @NotBlank
        String idUsuario,
        @NotBlank
        String codProduto,
        @NotNull
        BigDecimal kgComponente

) {}