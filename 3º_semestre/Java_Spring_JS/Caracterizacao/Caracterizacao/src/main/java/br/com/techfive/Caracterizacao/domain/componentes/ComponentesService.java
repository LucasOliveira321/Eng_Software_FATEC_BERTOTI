package br.com.techfive.Caracterizacao.domain.componentes;

import br.com.techfive.Caracterizacao.domain.caracterizacao.StatusCaracterizacao;
import br.com.techfive.Caracterizacao.domain.composicao.Composicao;
import br.com.techfive.Caracterizacao.domain.composicao.ComposicaoRepository;
import br.com.techfive.Caracterizacao.domain.composicao.DadosCadastroComposicao;
import br.com.techfive.Caracterizacao.domain.produto.Produto;
import br.com.techfive.Caracterizacao.domain.produto.ProdutoRepository;
import br.com.techfive.Caracterizacao.domain.usuario.Usuario;
import br.com.techfive.Caracterizacao.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
public class ComponentesService {
    @Autowired
    private ComponentesRepository componentesRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private ComposicaoRepository composicaoRepository;

    public void cadastrar(DadosCadastroComponentes dados){
        Usuario usuario = usuarioRepository.getReferenceById(dados.idUsuario());
        Produto produto = produtoRepository.getReferenceById(dados.codProduto());

        Componentes componentes = new Componentes(dados);
        componentes.setIdUsuario(usuario);
        componentes.setCodProduto(produto);

        Composicao composicao = composicaoRepository.getReferenceById(dados.idComposicao());
        Integer diferenca = composicao.getSaldoComposicao().compareTo(dados.kgComponente());
        System.out.println(composicao.getSaldoComposicao());

        System.out.println(diferenca);
        if(diferenca > 0 ){
            composicao.adicionarComponentes(componentes);
        }else if(diferenca.equals(0)) {
            composicao.adicionarComponentes(componentes);
            composicao.getIdCaracterizacao().setStatus(StatusCaracterizacao.COMPLETO);
        }else {
            throw new RuntimeException("Peso excede o limite permitido!");
        }

    }
}
