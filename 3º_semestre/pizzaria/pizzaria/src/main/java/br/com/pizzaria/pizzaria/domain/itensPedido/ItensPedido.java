package br.com.pizzaria.pizzaria.domain.itensPedido;

import br.com.pizzaria.pizzaria.domain.pedido.DadosCadastroPedido;
import br.com.pizzaria.pizzaria.domain.pedido.Pedido;
import br.com.pizzaria.pizzaria.domain.pizza.Pizza;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Entity
@Table(name = "itens_pedido")
@NoArgsConstructor
@Data
public class ItensPedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Pedido pedido;
    @ManyToOne(fetch = FetchType.LAZY)
    private Pizza pizza;
    private BigDecimal valorItem = BigDecimal.ZERO;

    public ItensPedido(DadosCadastroItensPedido dados){
        this.valorItem = dados.valorItem();
    }

}
