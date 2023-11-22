package br.com.techfive.Caracterizacao.domain.familiaDeMaterial;


import br.com.techfive.Caracterizacao.domain.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "familia_material")
@NoArgsConstructor
@Data
public class FamiliaDeMaterial {
    @Id
    private String codigo;
    private String descricao;
    @Enumerated(EnumType.STRING)
    private Status status;

    public FamiliaDeMaterial(DadosCadastroFamiliaDeMaterial dados){
        this.codigo = dados.codigo().trim();
        this.descricao = dados.descricao().toUpperCase().trim();
        this.status = Status.ATIVO;
    }

}
