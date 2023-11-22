package br.com.techfive.Caracterizacao.domain.usuario;

import br.com.techfive.Caracterizacao.domain.Status;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCrypt;

@Entity
@Table(name = "usuario")
@NoArgsConstructor
@Data
public class Usuario {
    @Id
    private String email;
    private String senha;
    private String nome;
    @Enumerated(EnumType.STRING)
    private Cargo cargo;
    @Enumerated(EnumType.STRING)
    private Status status;

    public Usuario(DadosCadastroUsuario dados){
        this.email = dados.email().toLowerCase().trim();

        String senhaCriptografada = BCrypt.hashpw(dados.senha(),BCrypt.gensalt());
        this.senha = senhaCriptografada;

        this.nome = dados.nome().toUpperCase().trim();
        this.cargo = dados.cargo();
        this.status = Status.ATIVO;
    }
}
