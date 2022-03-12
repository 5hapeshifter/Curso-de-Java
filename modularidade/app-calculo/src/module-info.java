import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.CalculadoraImpl;

module app.calculo { // usando o java reflection, deixando o m�dulo como "open module", � poss�vel alterar os atributos de uma classe mesmo que esteja como private

    // Aqui definimos exatamente o que queremos exportar e os subpacotes n�o s�o automaticamente acess�veis, ou seja, temos que declar�-los tamb�m se quisermos utiliz�-los
    exports br.com.cod3r.app.calculo;

    // requires transitive serve para podermos usar m�todos da classe em m�dulos terceiros para os quais n�o foi estabelecida uma conex�o direta, ou seja, h� uma conex�o dos m�dulos entre A e B, queremos usar um m�todo de A em C a partir de B, com essa anota��o conseguimos executar essa opera��o
    requires transitive app.logging;

    // forma de exportar para um m�dulo espec�fico
    exports br.com.cod3r.app.calculo.interno
            to app.financeiro; // para adicionar mais m�dulos � necess�rio colocar a v�rgula para separ�-los

    // forma de abrir um pacote espec�fico e manter o m�dulo fechado
    //opens br.com.cod3r.app.calculo;

    // forma de abrir um pacote para projetos espec�ficos
    opens br.com.cod3r.app.calculo to app.logging, app.financeiro;

    requires app.api;

    // aqui estamos explicitando que esse m�dulo, app.calculo, fornece uma interface Calculadora implementada atrav�s de CalculadoraImpl
    provides br.com.cod3r.app.Calculadora
            with br.com.cod3r.app.calculo.CalculadoraImpl;
}