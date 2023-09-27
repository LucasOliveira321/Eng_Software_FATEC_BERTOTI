package br.com.pizzaria.pizzaria.domain.pedido;

import br.com.pizzaria.pizzaria.domain.itensPedido.ItensPedido;
import br.com.pizzaria.pizzaria.domain.itensPedido.ItensPedidoRepository;
import br.com.pizzaria.pizzaria.domain.usuario.Usuario;
import br.com.pizzaria.pizzaria.domain.usuario.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private ItensPedidoRepository itensPedidoRepository;

    public void salvar(DadosCadastroPedido dados){
        Usuario user = usuarioRepository.getReferenceById(dados.usuario_id());
        ItensPedido itens = itensPedidoRepository.getReferenceById(dados.itens());
        Pedido pedido = new Pedido(dados);
        pedido.setUsuario_id(user);
        pedido.adicionaItens(itens);
        pedidoRepository.save(pedido);
    }
}
