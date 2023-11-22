package br.com.techfive.Caracterizacao.controller;

import br.com.techfive.Caracterizacao.domain.produto.*;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoService;

    @GetMapping("/produto-entrada")
    public ResponseEntity<List<Produto>> pegaProdutosEntrada(){
        List<Produto> produtos = produtoService.pegaProdutosEntrada();
        return ResponseEntity.ok(produtos);
    }

    @GetMapping("/produto-composicao")
    public ResponseEntity<List<Produto>> pegaProdutosComposicao(){
        List<Produto> produtos = produtoService.pegaProdutosComposicao();
        return ResponseEntity.ok(produtos);
    }

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroProdutos dados){
        produtoService.cadastrar(dados);
        return ResponseEntity.ok().build();
    }
}
