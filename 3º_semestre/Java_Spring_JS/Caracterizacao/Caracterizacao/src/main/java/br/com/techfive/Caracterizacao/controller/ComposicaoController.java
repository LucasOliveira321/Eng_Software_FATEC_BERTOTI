package br.com.techfive.Caracterizacao.controller;

import br.com.techfive.Caracterizacao.domain.componentes.Componentes;
import br.com.techfive.Caracterizacao.domain.composicao.Composicao;
import br.com.techfive.Caracterizacao.domain.composicao.ComposicaoService;
import br.com.techfive.Caracterizacao.domain.composicao.DadosCadastroComposicao;
import br.com.techfive.Caracterizacao.domain.composicao.DadosConsultaComposicao;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/composicao")
public class ComposicaoController {

    @Autowired
    private ComposicaoService composicaoService;

    @GetMapping("/todas")
    public ResponseEntity<List<Composicao>> pegarComposicoes(){
        List<Composicao> composicoes = composicaoService.pegarComposicoes();
        return ResponseEntity.ok(composicoes);
    }

    @GetMapping
    public ResponseEntity<List<Composicao>> pegarComposicoesPendentes(){
        List<Composicao> composicoes = composicaoService.pegarComposicoesPendentes();
        return ResponseEntity.ok(composicoes);
    }

    @PostMapping("/por-id")
    @Transactional
    public ResponseEntity<List<Componentes>> consultarPorId(@RequestBody @Valid DadosConsultaComposicao dados){
        List<Componentes> componentes = composicaoService.pegarComponentesPorComposicao(dados.idComposicao());
        return ResponseEntity.ok(componentes);
    }

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroComposicao dados){
        composicaoService.cadastrar(dados);
        return ResponseEntity.ok().build();
    }
}
