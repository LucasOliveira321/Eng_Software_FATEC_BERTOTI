package br.com.techfive.Caracterizacao.domain.caracterizacao;


import br.com.techfive.Caracterizacao.domain.Status;
import br.com.techfive.Caracterizacao.domain.composicao.Composicao;
import br.com.techfive.Caracterizacao.domain.produto.Produto;
import br.com.techfive.Caracterizacao.domain.usuario.Usuario;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "caracterizacao")
@NoArgsConstructor
@Data
public class Caracterizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "data_criacao")
    private LocalDate dataCriacao;
    private String fabricante;
    @Column(name = "part_number")
    private String partNumber;
    private String modelo;
    @ManyToOne
    private Usuario executor;
    @ManyToOne
    private Usuario acompanhante;
    @ManyToOne
    private Produto produto;
    @Column(name = "peso_equipamento", precision = 38, scale = 3)
    private BigDecimal pesoEquipamento;
    @Column(name = "largura_cm", precision = 38, scale = 3)
    private BigDecimal larguraCm;
    @Column(name = "comprimento_cm", precision = 38, scale = 3)
    private BigDecimal comprimentoCm;
    @Column(name = "altura_cm", precision = 38, scale = 3)
    private BigDecimal alturaCm;
    @Column(name = "tempo_processamento_hora", precision = 38, scale = 3)
    private BigDecimal tempoProcessamentoHora;
    private String observacao;
    @Enumerated(EnumType.STRING)
    private StatusCaracterizacao status;

    public Caracterizacao(DadosCadastroCaracterizacao dados){
        this.dataCriacao = LocalDate.now();
        this.status = StatusCaracterizacao.PENDENTE_MONTAR_COMPOSICAO;

        this.fabricante = dados.fabricante().toUpperCase().trim();
        this.partNumber = dados.partNumber().toUpperCase().trim();
        this.modelo = dados.modelo().toUpperCase().trim();
        this.pesoEquipamento = dados.pesoEquipamento();
        this.larguraCm = dados.larguraCm();
        this.alturaCm = dados.alturaCm();
        this.comprimentoCm = dados.comprimentoCm();
        this.tempoProcessamentoHora = dados.tempoProcessamentoHora();

        if(dados.observacao().equals(null) || dados.observacao() == ""){
            this.observacao = "-";
        }else {
            this.observacao = dados.observacao().toUpperCase().trim();
        }
    }
}
