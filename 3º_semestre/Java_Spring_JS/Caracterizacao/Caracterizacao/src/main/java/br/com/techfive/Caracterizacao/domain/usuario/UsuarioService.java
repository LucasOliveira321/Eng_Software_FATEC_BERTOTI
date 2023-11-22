package br.com.techfive.Caracterizacao.domain.usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void cadastraUsuario(DadosCadastroUsuario dados){
        Usuario usuario = new Usuario(dados);
        usuarioRepository.save(usuario);
    }

    public List<Usuario> getAllUsuarios() {
        List<Usuario> usuarios = usuarioRepository.findAll();
        return  usuarios;
    }
}
