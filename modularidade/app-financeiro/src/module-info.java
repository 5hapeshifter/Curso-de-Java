module app.financeiro {

    // java.base � importado por padr�o, n�o precisa declarar
    requires java.base;
    //requires app.calculo;
    // implementamos a api publica pq ela que est� fornecendo o m�todo atrav�s da interface
    requires app.api;
    // precisamos declarar que usaremos a interface para encontrar a implementa��o, nesse caso Calculadora implementa a api publica
    uses br.com.cod3r.app.Calculadora;

}