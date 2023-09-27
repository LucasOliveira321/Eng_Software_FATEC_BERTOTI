package br.com.pizzaria.pizzaria.domain.pizza;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;

public record DadosCadastroPizza(
        @NotBlank
        String nome,
        @NotBlank
        String ingredientes,
        @NotNull
        BigDecimal precoInteira,
        @NotNull
        BigDecimal precoMeia,
        @NotBlank
        String imagem) {}
