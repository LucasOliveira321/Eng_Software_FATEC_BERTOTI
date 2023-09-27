package br.com.pizzaria.pizzaria.domain.pedido;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDateTime;

public record DadosCadastroPedido(
        @NotNull
        Integer usuario_id,
        @NotBlank
        Integer itens){}