package br.com.cod3r.exerciciossb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{primeiroValor}/{segundoValor}")
    public int somar(@PathVariable int primeiroValor, @PathVariable int segundoValor){
        return primeiroValor + segundoValor;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "primeiroValor") int primeiroValor, @RequestParam(name = "segundoValor") int segundoValor){
        return primeiroValor - segundoValor;
    }

}
