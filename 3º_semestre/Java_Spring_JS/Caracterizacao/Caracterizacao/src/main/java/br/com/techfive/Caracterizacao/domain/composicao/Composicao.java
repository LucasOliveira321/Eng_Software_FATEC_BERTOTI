package br.com.techfive.Caracterizacao.domain.composicao;

import br.com.techfive.Caracterizacao.domain.caracterizacao.Caracterizacao;
import br.com.techfive.Caracterizacao.domain.caracterizacao.DadosCadastroCaracterizacao;
import br.com.techfive.Caracterizacao.domain.componentes.Componentes;
import br.com.techfive.Caracterizacao.domain.produto.Produto;
import br.com.techfive.Caracterizacao.domain.usuario.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "composicao")
@NoArgsConstructor
@Data
public class Composicao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idComposicao;
    @ManyToOne
    @JoinColumn(name = "id_caracterizacao")
    private Caracterizacao IdCaracterizacao;
    @Column(name = "peso_total", precision = 38, scale = 3)
    private BigDecimal pesoTotal = BigDecimal.ZERO;
    @Column(name = "saldo_composicao", precision = 38, scale = 3)
    private BigDecimal saldoComposicao = BigDecimal.ZERO;
    @ManyToOne
    @JoinColumn(name = "id_usuario")
    private Usuario idUsuario;
    @OneToMany(mappedBy = "idComposicao", cascade = CascadeType.ALL)
    @JsonManagedReference
    @JsonIgnore
    private List<Componentes> componentes = new ArrayList<>();
    private LocalDate dataCriacao;

    public Composicao(DadosCadastroComposicao dados){
        this.dataCriacao = LocalDate.now();
    }
    public void adicionarComponentes(Componentes componentes){
        componentes.setIdComposicao(this);
        this.saldoComposicao = this.saldoComposicao.subtract(componentes.getKgApontado());
        this.componentes.add(componentes);
    }
}
