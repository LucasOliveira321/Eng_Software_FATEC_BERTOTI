package br.com.pizzaria.pizzaria.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cardapio")
public class MenuController {
    @GetMapping
    public String menu(){
        return "cardapio";
    }

    @GetMapping("/pedido")
    public String pedido(){
        return "pedido";
    }
}
