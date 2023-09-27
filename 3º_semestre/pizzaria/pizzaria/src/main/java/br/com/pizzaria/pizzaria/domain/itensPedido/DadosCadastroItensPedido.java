package br.com.pizzaria.pizzaria.domain.itensPedido;

import jakarta.validation.constraints.NotNull;

import java.math.BigDecimal;

public record DadosCadastroItensPedido(
    @NotNull
    Integer pedido,
    @NotNull
    Integer pizza,
    @NotNull
    BigDecimal valorItem){}
