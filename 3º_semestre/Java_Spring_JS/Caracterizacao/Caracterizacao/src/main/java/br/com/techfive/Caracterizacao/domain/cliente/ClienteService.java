package br.com.techfive.Caracterizacao.domain.cliente;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente cadastrarCliente(DadosCadastroCliente dados){
        Cliente cli = new Cliente(dados);
        clienteRepository.save(cli);
        return  cli;
    }

    public List<Cliente> getListaCliente() {
        List<Cliente> cliente = new ArrayList<>();
        cliente.addAll(clienteRepository.findAll());

        return cliente;
    }

    public Cliente getClienteById(Integer clienteId) {
        Cliente cli = clienteRepository.getReferenceById(clienteId);
        return cli;
    }

    public void excluirCliente(Integer id) {
        clienteRepository.deleteById(id);
    }


}
