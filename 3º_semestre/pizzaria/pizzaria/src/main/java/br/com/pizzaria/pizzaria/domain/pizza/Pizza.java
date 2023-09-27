package br.com.pizzaria.pizzaria.domain.pizza;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "pizza")
@NoArgsConstructor
@Data
public class Pizza{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String ingredientes;
    private BigDecimal precoInteira = BigDecimal.ZERO;
    private BigDecimal precoMeia = BigDecimal.ZERO;
    private String imagem;

    public Pizza(DadosCadastroPizza dados){
        this.nome = dados.nome().trim();
        this.ingredientes = dados.ingredientes().trim();
        this.precoInteira = dados.precoInteira();
        this.precoMeia = dados.precoMeia();
        this.imagem = dados.imagem();
    }
}
