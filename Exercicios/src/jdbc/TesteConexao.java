package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {

    public static void main(String[] args) throws SQLException { // essa esseção quer dizer que se ocorrer um problema, ele sai do método main e para de executar a aplicação
//        Usando jdbc, trabalharemos em quase 100% do tempo usando interfaces
//        String stringConexao = "jdbc:mysql://localhost:3307"; forma de conexao declarando uma porta
        final String stringConexao = "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; // por padrao a conexao é na porta 3306, por isso nao precisa declarar
        final String usuario = "root";
        final String senha = "root";
//      PARA ADICIONAR O JCONNECTOR NO INTELLIJ, IR EM FILE > PROJECT STRUCTURE > LIBRARIES E COLOCAR O SISTEMA COM A VERSÃO(EX:mysql:mysql-connector-java:8.0.27)
        Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha); // sempre usar a conexao de java.sql

        System.out.println("Conexao efetuada com sucesso!");
        conexao.close();

    }
}
