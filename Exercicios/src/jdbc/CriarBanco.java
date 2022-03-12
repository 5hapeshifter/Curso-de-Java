package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

    public static void main(String[] args) throws SQLException {

        final String stringConexao = "jdbc:mysql://localhost:3306?verifyServerCertificate=false&useSSL=true"; // por padrao a conexao é na porta 3306, por isso nao precisa declarar
        final String usuario = "root";
        final String senha = "root";

        Connection conexao = DriverManager.getConnection(stringConexao, usuario, senha);

        Statement stmt = conexao.createStatement();
        stmt.execute("CREATE DATABASE IF NOT EXISTS curso_java");

        System.out.println("Banco criado com sucesso!");

        conexao.close();

    }
}
