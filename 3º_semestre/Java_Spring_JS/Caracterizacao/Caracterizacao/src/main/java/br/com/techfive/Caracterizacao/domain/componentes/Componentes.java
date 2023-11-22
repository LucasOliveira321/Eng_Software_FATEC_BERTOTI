package br.com.techfive.Caracterizacao.domain.componentes;

import br.com.techfive.Caracterizacao.domain.composicao.Composicao;
import br.com.techfive.Caracterizacao.domain.produto.Produto;
import br.com.techfive.Caracterizacao.domain.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "componentes")
@NoArgsConstructor
@Data
public class Componentes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComponentes;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_composicao")
    @JsonBackReference
    private Composicao idComposicao;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "cod_produto")
    private Produto codProduto;
    @Column(name = "kg_apontado", precision = 38, scale = 3)
    private BigDecimal kgApontado = BigDecimal.ZERO;
    private LocalDateTime dataApontamento;

    public Componentes(DadosCadastroComponentes dados){
        this.kgApontado = dados.kgComponente();
        this.dataApontamento = LocalDateTime.now();
    }
}
