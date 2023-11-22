package br.com.techfive.Caracterizacao.domain.produto;

import br.com.techfive.Caracterizacao.domain.Status;
import br.com.techfive.Caracterizacao.domain.familiaDeMaterial.FamiliaDeMaterial;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "produto")
@NoArgsConstructor
@Data
public class Produto {
    @Id
    private String codProduto;
    private String descricao;

    @ManyToOne
    @JoinColumn(name = "familia_id")
    private FamiliaDeMaterial familia;

    @Enumerated(EnumType.STRING)
    private Status status;

    public Produto(DadosCadastroProdutos dados){
        this.descricao = dados.descricao().toUpperCase().trim();
        this.status = Status.ATIVO;
    }
}
