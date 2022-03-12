package br.com.cod3r.app.financeiro;

import br.com.cod3r.app.Calculadora;

import java.lang.reflect.Field;
import java.util.ServiceLoader;

public class Teste {

    public static void main(String[] args) {

        // Dessa forma não dependemos mais das classes, ou seja, de uma implementação específica, dessa forma podemos fazer várias implementações de uma mesma interface
        Calculadora calc = ServiceLoader
                .load(Calculadora.class)
                .findFirst()
                .get();
        System.out.println(calc.soma(2, 3, 4));

        // nova implementação dependendo apenas das interfaces da api publica

        try {
            // Estamos alterando o valor padrão do atributo ID tendo em vista que marcamos ele como open
            Field fieldId = calc.getClass().getDeclaredFields()[0];
            fieldId.setAccessible(true);
            fieldId.set(calc, "def");
            fieldId.setAccessible(false);

            System.out.println(calc.getId());

        } catch (Exception e) {
            e.printStackTrace();
        }

//        // Precisamos importar o app.calculo no module-info para utilizar os métodos abaixo, antiga implementação sem a interface da api publica
//        System.out.println(calc.getLoggerClass());
//
//        OperacoesAritmeticas op = new OperacoesAritmeticas();
//        System.out.println(op.soma(4, 5, 6));
//
//        try {
//            // Estamos alterando o valor padrão do atributo ID tendo em vista que marcamos ele como open
//            Field fieldId = CalculadoraImpl.class.getDeclaredFields()[0];
//            fieldId.setAccessible(true);
//            fieldId.set(calc, "def");
//            fieldId.setAccessible(false);
//
//            System.out.println(calc.getId());
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(CalculadoraImpl.class.getDeclaredFields()[0].getName());
    }
}
