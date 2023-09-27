package br.com.pizzaria.pizzaria.domain.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void salvar(DadosCadastroUsuario dados){
        Usuario user = new Usuario(dados);
        usuarioRepository.save(user);
    }
}
