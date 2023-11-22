package br.com.techfive.Caracterizacao.controller;

import br.com.techfive.Caracterizacao.domain.usuario.DadosCadastroUsuario;
import br.com.techfive.Caracterizacao.domain.usuario.Usuario;
import br.com.techfive.Caracterizacao.domain.usuario.UsuarioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping
    public ResponseEntity<List<Usuario>> pegaUsuarios(){
        List<Usuario> usuarios = usuarioService.getAllUsuarios();
        return ResponseEntity.ok(usuarios);
    }

    @PostMapping
    @Transactional
    public ResponseEntity cadastrarUsuario(@RequestBody @Valid DadosCadastroUsuario dados){
        usuarioService.cadastraUsuario(dados);

        return ResponseEntity.ok().build();
    }
}
