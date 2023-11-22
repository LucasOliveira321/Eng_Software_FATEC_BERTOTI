package br.com.techfive.Caracterizacao.domain.composicao;

import br.com.techfive.Caracterizacao.domain.caracterizacao.Caracterizacao;
import br.com.techfive.Caracterizacao.domain.caracterizacao.CaracterizacaoRepository;
import br.com.techfive.Caracterizacao.domain.caracterizacao.StatusCaracterizacao;
import br.com.techfive.Caracterizacao.domain.componentes.Componentes;
import br.com.techfive.Caracterizacao.domain.usuario.Usuario;
import br.com.techfive.Caracterizacao.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComposicaoService {
    @Autowired
    private ComposicaoRepository composicaoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private CaracterizacaoRepository caracterizacaoRepository;

    public void cadastrar(DadosCadastroComposicao dados){
        Caracterizacao caracterizacao = caracterizacaoRepository.getReferenceById(dados.idCaracterizacao());
        Usuario usuario = usuarioRepository.getReferenceById(dados.idUsuario());

        Composicao composicao = new Composicao(dados);
        composicao.setPesoTotal(caracterizacao.getPesoEquipamento());
        composicao.setSaldoComposicao(caracterizacao.getPesoEquipamento());
        composicao.setIdUsuario(usuario);
        composicao.setIdCaracterizacao(caracterizacao);

        caracterizacao.setStatus(StatusCaracterizacao.COMPOSICAO_ABERTA);

        composicaoRepository.save(composicao);
    }

    public Caracterizacao getCaracterizacaoById(Integer idCaracterizacao) {
        Caracterizacao caracterizacao = caracterizacaoRepository.getReferenceById(idCaracterizacao);
        return caracterizacao;
    }

    public List<Composicao> pegarComposicoes() {
        List<Composicao> composicoes = composicaoRepository.findAll();
        return composicoes;
    }

    public Composicao pegarComposicaoPorId(Integer idComposicao) {
        Composicao composicao = composicaoRepository.getReferenceById(idComposicao);
        return composicao;
    }

    public List<Composicao> pegarComposicoesPendentes() {
        List<Composicao> composicoes = composicaoRepository.buscaComposicoesPendentes();
        return  composicoes;
    }

    public List<Componentes> pegarComponentesPorComposicao(Integer idComposicao) {
        List<Componentes> componentes = composicaoRepository.pegarComponentesPorComposicao(composicaoRepository.getReferenceById(idComposicao));
        return componentes;
    }
}
