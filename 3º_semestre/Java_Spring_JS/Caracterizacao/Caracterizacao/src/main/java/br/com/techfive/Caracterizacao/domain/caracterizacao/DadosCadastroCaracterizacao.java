package br.com.techfive.Caracterizacao.domain.caracterizacao;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record DadosCadastroCaracterizacao(
        @NotBlank
        String fabricante,
        @NotBlank
        String partNumber,
        @NotBlank
        String modelo,
        @NotBlank
        String executor,
        @NotBlank
        String acompanhante,
        @NotBlank
        String produto,
        @NotNull
        BigDecimal pesoEquipamento,
        @NotNull
        BigDecimal larguraCm,
        @NotNull
        BigDecimal comprimentoCm,
        @NotNull
        BigDecimal alturaCm,
        @NotNull
        BigDecimal tempoProcessamentoHora,
        String observacao
) {}