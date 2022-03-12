package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoesAritmeticas;
import br.com.cod3r.app.logging.Logger;

public class CalculadoraImpl implements Calculadora {

    private String id = "abc";

    private OperacoesAritmeticas opAritmeticas = new OperacoesAritmeticas();

    // Delegate methods serve para criarmos um método que chama um método de outra classe, ou seja, acaba delegando a execução do método para outra classe
    public double soma(double... nums) {
        Logger.info("Somando...");
        return opAritmeticas.soma(nums);
    }

    public Class<Logger> getLoggerClass() {
        return Logger.class;
    }

    public String getId() {
        return id;
    }
}
