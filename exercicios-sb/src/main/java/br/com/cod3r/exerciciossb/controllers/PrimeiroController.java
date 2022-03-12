package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class PrimeiroController {

    //@RequestMapping(method = RequestMethod.GET, path = "/ola")// por padrão a propriedade method aponta para um tipo GET, sem (method = RequestMethod.GET) também funcionaria normalmente, path define o caminho para chamar o método
    @GetMapping(path = {"/ola", "/saudacao"}) // podemos colocar mais de uma url para um mesmo método, pois é um array de string
    public String ola() {
        return "Olá Spring Boot!";
    }


}
