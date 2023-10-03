package br.com.pizzaria.pizzaria.controller;

import br.com.pizzaria.pizzaria.domain.pizza.DadosCadastroPizza;
import br.com.pizzaria.pizzaria.domain.pizza.PizzaService;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@CrossOrigin("*")
@RequestMapping("/pizza")
public class PizzaController {
    @Autowired
    private PizzaService pizzaService;

    @PostMapping("/salvar")
    public void salvar(@RequestBody @Valid DadosCadastroPizza dados){
        System.out.println(dados.nome() + " - " + dados.precoInteira());
        pizzaService.salvar(dados);
    }
}
