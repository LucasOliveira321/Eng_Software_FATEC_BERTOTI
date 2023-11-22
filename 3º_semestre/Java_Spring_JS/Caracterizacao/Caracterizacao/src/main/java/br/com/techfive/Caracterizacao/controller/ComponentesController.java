package br.com.techfive.Caracterizacao.controller;

import br.com.techfive.Caracterizacao.domain.componentes.ComponentesService;
import br.com.techfive.Caracterizacao.domain.componentes.DadosCadastroComponentes;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/componentes")
public class ComponentesController {
    @Autowired
    private ComponentesService componentesService;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroComponentes dados){
        componentesService.cadastrar(dados);
        return ResponseEntity.ok().build();
    }
}
