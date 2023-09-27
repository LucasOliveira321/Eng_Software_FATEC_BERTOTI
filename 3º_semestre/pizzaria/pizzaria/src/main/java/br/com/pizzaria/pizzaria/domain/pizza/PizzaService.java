package br.com.pizzaria.pizzaria.domain.pizza;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PizzaService {
    @Autowired
    private PizzaRepository pizzaRepository;

    public void salvar(DadosCadastroPizza dados){
        Pizza pizza = new Pizza(dados);
        pizzaRepository.save(pizza);
    }
    public List<Pizza> buscaTodasPizza(){
        List<Pizza> pizzas = pizzaRepository.findAll();
        return pizzas;
    }
}
