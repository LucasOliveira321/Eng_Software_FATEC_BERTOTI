package br.com.techfive.Caracterizacao.domain.cliente;

import br.com.techfive.Caracterizacao.domain.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "cliente")
@NoArgsConstructor
@Data
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "nome_empresa")
    private String nomeEmpresa;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Cliente(DadosCadastroCliente dados) {
        this.nomeEmpresa = dados.nomeEmpresa().toUpperCase();
        this.status = Status.ATIVO;
    }
}
