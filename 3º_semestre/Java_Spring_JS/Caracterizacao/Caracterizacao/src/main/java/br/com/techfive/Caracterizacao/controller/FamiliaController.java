package br.com.techfive.Caracterizacao.controller;

import br.com.techfive.Caracterizacao.domain.familiaDeMaterial.DadosCadastroFamiliaDeMaterial;
import br.com.techfive.Caracterizacao.domain.familiaDeMaterial.FamiliaDeMaterial;
import br.com.techfive.Caracterizacao.domain.familiaDeMaterial.FamiliaDeMaterialService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/familia_material")
public class FamiliaController {
    @Autowired
    private FamiliaDeMaterialService familiaService;

    @GetMapping
    public ResponseEntity<List<FamiliaDeMaterial>> getFamiliaMaterial(){
        List<FamiliaDeMaterial> familias = familiaService.getListaFamiliaMaterial();
        return ResponseEntity.ok(familias);
    }

    @PostMapping
    @Transactional
    public ResponseEntity cadastraFamilia(@RequestBody @Valid DadosCadastroFamiliaDeMaterial dados){
        familiaService.cadastrar(dados);
        return ResponseEntity.ok().build();
    }

    @PutMapping
    @Transactional
    public ResponseEntity alterar(@RequestBody @Valid DadosCadastroFamiliaDeMaterial dados){
        familiaService.setFamiliaMaterial(dados);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity deletar(@RequestBody String codigo){
        familiaService.excluir(codigo);
        return ResponseEntity.ok().build();
    }
}
