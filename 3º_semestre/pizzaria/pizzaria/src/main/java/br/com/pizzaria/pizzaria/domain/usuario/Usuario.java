package br.com.pizzaria.pizzaria.domain.usuario;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@Data
public class Usuario {
    @Id
    private Integer telefone;
    private String nome;
    private String bairro;
    private String cep;
    private String complemento;
    //cidade
    private String localidade;
    private String logradouro;
    private String uf;

    public Usuario(DadosCadastroUsuario dados){
        this.telefone = dados.telefone();
        this.nome = dados.nome();
        this.bairro = dados.bairro();
        this.cep = dados.cep();
        this.complemento = dados.complemento();
        this.localidade = dados.localidade();
        this.logradouro = dados.logradouro();
        this.uf = dados.uf();
    }
}
