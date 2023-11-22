package br.com.techfive.Caracterizacao.domain.caracterizacao;

import br.com.techfive.Caracterizacao.domain.composicao.Composicao;
import br.com.techfive.Caracterizacao.domain.composicao.ComposicaoRepository;
import br.com.techfive.Caracterizacao.domain.produto.ProdutoRepository;
import br.com.techfive.Caracterizacao.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CaracterizacaoService {
    @Autowired
    private CaracterizacaoRepository caracterizacaoRepository;
    @Autowired
    private ProdutoRepository produtosRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ComposicaoRepository composicaoRepository;

    public void cadastrarCaracterizacao(DadosCadastroCaracterizacao dados){
        var carac = new Caracterizacao(dados);
        carac.setAcompanhante(usuarioRepository.getReferenceById(dados.acompanhante()));
        carac.setExecutor(usuarioRepository.getReferenceById(dados.executor()));
        carac.setProduto(produtosRepository.getReferenceById(dados.produto()));

        caracterizacaoRepository.save(carac);
    }
    public List<Caracterizacao> getCaracterizacao() {
        List<Caracterizacao> caracterizacao = caracterizacaoRepository.findAll();
        return caracterizacao;
    }

    public Caracterizacao pegarCaracterizacaoPorId(Integer id) {
        Composicao composicao = composicaoRepository.getReferenceById(id);
        Caracterizacao caracterizacao = composicao.getIdCaracterizacao();
        return caracterizacao;
    }
}
