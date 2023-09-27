package br.com.pizzaria.pizzaria.domain.pedido;

import br.com.pizzaria.pizzaria.domain.itensPedido.ItensPedido;
import br.com.pizzaria.pizzaria.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "pedido")
@NoArgsConstructor
@Data
public class Pedido {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToMany
    private Usuario usuario_id;
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
    private List<ItensPedido> itens;
    private BigDecimal valorTotal = BigDecimal.ZERO;
    private LocalDateTime dataPedido;

    public Pedido(DadosCadastroPedido dados) {
        this.dataPedido = LocalDateTime.now();
    }

    public void adicionaItens(ItensPedido item){
        item.setPedido(this);
        this.itens.add(item);
        this.valorTotal = this.valorTotal.add(item.getValorItem());
    }
}
