package br.com.techfive.Caracterizacao.controller;

import br.com.techfive.Caracterizacao.domain.caracterizacao.Caracterizacao;
import br.com.techfive.Caracterizacao.domain.caracterizacao.CaracterizacaoService;
import br.com.techfive.Caracterizacao.domain.caracterizacao.DadosCadastroCaracterizacao;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/caracterizacao")
public class CaracterizacaoController {
    @Autowired
    private CaracterizacaoService caracterizacaoService;

    @GetMapping
    public ResponseEntity<List<Caracterizacao>> pegarCaracterizacao(){
        List<Caracterizacao> caracterizacao = caracterizacaoService.getCaracterizacao();
        return ResponseEntity.ok(caracterizacao);
    }

    @PostMapping("/consulta-caracterizacao")
    @Transactional
    public ResponseEntity<Caracterizacao> pegarCaracterizacaoPorId(@RequestBody Integer idComposicao){
        Caracterizacao caracterizacao = caracterizacaoService.pegarCaracterizacaoPorId(idComposicao);
        return ResponseEntity.ok(caracterizacao);
    }

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroCaracterizacao dados){
        caracterizacaoService.cadastrarCaracterizacao(dados);
        return ResponseEntity.ok().build();
    }
}
