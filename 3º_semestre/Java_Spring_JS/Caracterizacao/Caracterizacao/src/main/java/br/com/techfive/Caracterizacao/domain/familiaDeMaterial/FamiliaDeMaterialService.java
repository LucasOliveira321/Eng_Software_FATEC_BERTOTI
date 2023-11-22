package br.com.techfive.Caracterizacao.domain.familiaDeMaterial;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FamiliaDeMaterialService {
    @Autowired
    private FamiliaDeMaterialReository familiaRepository;

    public void cadastrar(DadosCadastroFamiliaDeMaterial dados){
        FamiliaDeMaterial familia = new FamiliaDeMaterial(dados);
        familiaRepository.saveAndFlush(familia);
    }

    public List<FamiliaDeMaterial> getListaFamiliaMaterial(){
        List<FamiliaDeMaterial> familia = new ArrayList<>();
        familia.addAll(familiaRepository.findAll());

        return familia;
    }

    public void setFamiliaMaterial(DadosCadastroFamiliaDeMaterial dados){
        FamiliaDeMaterial familia = new FamiliaDeMaterial(dados);
        familiaRepository.saveAndFlush(familia);
    }

    public void excluir(String codigo){
        familiaRepository.deleteById(codigo);
    }

    public FamiliaDeMaterial getReference(String familiaId) {
        FamiliaDeMaterial fm = familiaRepository.getReferenceById(familiaId);
        return fm;
    }
}
