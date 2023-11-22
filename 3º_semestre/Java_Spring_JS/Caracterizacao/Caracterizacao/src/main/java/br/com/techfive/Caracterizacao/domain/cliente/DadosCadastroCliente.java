package br.com.techfive.Caracterizacao.domain.cliente;

import jakarta.validation.constraints.NotBlank;

public record DadosCadastroCliente(@NotBlank String nomeEmpresa) {
}
