package br.com.pizzaria.pizzaria.domain.itensPedido;

import br.com.pizzaria.pizzaria.domain.pedido.Pedido;
import br.com.pizzaria.pizzaria.domain.pedido.PedidoRepository;
import br.com.pizzaria.pizzaria.domain.pizza.Pizza;
import br.com.pizzaria.pizzaria.domain.pizza.PizzaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItensPedidoService {
    @Autowired
    private ItensPedidoRepository itensPedidoRepository;
    @Autowired
    private PedidoRepository pedidoRepository;
    @Autowired
    private PizzaRepository pizzaRepository;

    public void save(DadosCadastroItensPedido dados){
        Pedido pedido = pedidoRepository.getReferenceById(dados.pedido());
        Pizza pizza = pizzaRepository.getReferenceById(dados.pizza());

        ItensPedido itensPedido = new ItensPedido(dados);
        itensPedido.setPedido(pedido);
        itensPedido.setPizza(pizza);

        itensPedidoRepository.save(itensPedido);
    }
}
