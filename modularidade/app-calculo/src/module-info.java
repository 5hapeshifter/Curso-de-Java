import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.CalculadoraImpl;

module app.calculo { // usando o java reflection, deixando o módulo como "open module", é possível alterar os atributos de uma classe mesmo que esteja como private

    // Aqui definimos exatamente o que queremos exportar e os subpacotes não são automaticamente acessíveis, ou seja, temos que declará-los também se quisermos utilizá-los
    exports br.com.cod3r.app.calculo;

    // requires transitive serve para podermos usar métodos da classe em módulos terceiros para os quais não foi estabelecida uma conexão direta, ou seja, há uma conexão dos módulos entre A e B, queremos usar um método de A em C a partir de B, com essa anotação conseguimos executar essa operação
    requires transitive app.logging;

    // forma de exportar para um módulo específico
    exports br.com.cod3r.app.calculo.interno
            to app.financeiro; // para adicionar mais módulos é necessário colocar a vírgula para separá-los

    // forma de abrir um pacote específico e manter o módulo fechado
    //opens br.com.cod3r.app.calculo;

    // forma de abrir um pacote para projetos específicos
    opens br.com.cod3r.app.calculo to app.logging, app.financeiro;

    requires app.api;

    // aqui estamos explicitando que esse módulo, app.calculo, fornece uma interface Calculadora implementada através de CalculadoraImpl
    provides br.com.cod3r.app.Calculadora
            with br.com.cod3r.app.calculo.CalculadoraImpl;
}