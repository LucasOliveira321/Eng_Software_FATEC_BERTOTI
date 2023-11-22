package br.com.techfive.Caracterizacao.controller;

import br.com.techfive.Caracterizacao.domain.cliente.Cliente;
import br.com.techfive.Caracterizacao.domain.cliente.ClienteService;
import br.com.techfive.Caracterizacao.domain.cliente.DadosCadastroCliente;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping("/consulta")
    public ResponseEntity<List<Cliente>> consulta(){
        List<Cliente> clientes = clienteService.getListaCliente();

        return ResponseEntity.ok(clientes);
    }
    @PostMapping
    @Transactional
    public ResponseEntity cadastrarCliente(@RequestBody @Valid DadosCadastroCliente dados){
        Cliente cliente = clienteService.cadastrarCliente(dados);

        return ResponseEntity.ok().build();
    }

    @DeleteMapping
    @Transactional
    public ResponseEntity deletarCliente(Integer id){
        clienteService.excluirCliente(id);

        return ResponseEntity.ok().build();
    }
}
