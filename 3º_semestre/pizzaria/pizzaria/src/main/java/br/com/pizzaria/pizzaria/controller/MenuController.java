package br.com.pizzaria.pizzaria.controller;

import br.com.pizzaria.pizzaria.domain.pizza.Pizza;
import br.com.pizzaria.pizzaria.domain.pizza.PizzaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cardapio")
public class MenuController {
    @Autowired
    private PizzaService pizzaService;

    @GetMapping(value = "/pizza")
    public List<Pizza> menu(){
        //model.addAttribute("pizzas", pizzaService.buscaTodasPizza());
        List<Pizza> pizzas = pizzaService.buscaTodasPizza();
        return pizzas;
    }

    @GetMapping("/pedido")
    public String pedido(){
        return "pages/pedido";
    }
}
