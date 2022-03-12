package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping("/qualquer")
    public Cliente obterCliente(){
        return new Cliente(28, "Pedro", "123.456.789-00");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) { // PathVariable ser para pegar o dado informado no path da url
        return new Cliente(id, "Maria", "987.654.321-00");
    }

    @GetMapping()
    public Cliente obterClientePorId2(
            @RequestParam(name = "id", defaultValue = "1") int id) { // RequestParam é a forma mais utilizada para se captar os dados do path
        return new Cliente(id, "João Augusto", "111.222.333-44");
    }

}
