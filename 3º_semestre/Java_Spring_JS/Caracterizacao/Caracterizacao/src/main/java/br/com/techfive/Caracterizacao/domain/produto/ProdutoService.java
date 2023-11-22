package br.com.techfive.Caracterizacao.domain.produto;

import br.com.techfive.Caracterizacao.domain.familiaDeMaterial.FamiliaDeMaterial;
import br.com.techfive.Caracterizacao.domain.familiaDeMaterial.FamiliaDeMaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private FamiliaDeMaterialService familiaDeMaterialService;

    public void cadastrar(DadosCadastroProdutos dados){
        Produto produto = new Produto(dados);
        FamiliaDeMaterial fm = familiaDeMaterialService.getReference(dados.familiaId());
        produto.setFamilia(fm);
        StringBuilder codProduto = new StringBuilder(dados.familiaId()).append(".").append(dados.codProduto());
        produto.setCodProduto(codProduto.toString());
        produtoRepository.saveAndFlush(produto);
    }

    public List<Produto> pegaProdutosEntrada() {
        List<Produto> produtos = produtoRepository.findAllByProdutosEntrada("01");
        return produtos;
    }

    public List<Produto> pegaProdutosComposicao() {
        List<Produto> produtos = produtoRepository.findAllByProdutosComposicao("01");
        return  produtos;
    }
}
