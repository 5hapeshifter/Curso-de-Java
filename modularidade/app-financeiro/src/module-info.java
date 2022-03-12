module app.financeiro {

    // java.base é importado por padrão, não precisa declarar
    requires java.base;
    //requires app.calculo;
    // implementamos a api publica pq ela que está fornecendo o método através da interface
    requires app.api;
    // precisamos declarar que usaremos a interface para encontrar a implementação, nesse caso Calculadora implementa a api publica
    uses br.com.cod3r.app.Calculadora;

}