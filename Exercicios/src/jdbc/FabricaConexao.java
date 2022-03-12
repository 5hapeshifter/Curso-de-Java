package jdbc;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class FabricaConexao {

    public static Connection getConexao() throws SQLException {

        try {
            Properties prop = getProperties();
            // O ideal é não chumbar os dados de login e senha, podemos configurar o arquivo properties para isso
            // informamos o banco de dados a ser usado logo depois do "localhost" para não dar problema
            //final String stringConexao = "jdbc:mysql://localhost/curso_java?verifyServerCertificate=false&useSSL=true"; // por padrao a conexao é na porta 3306, por isso nao precisa declarar
            final String stringConexao = prop.getProperty("banco.url"); // assim que conseguimos captar as informações do arquivo
            final String usuario = prop.getProperty("banco.usuario");
            final String senha = prop.getProperty("banco.senha");

            return DriverManager.getConnection(stringConexao, usuario, senha);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static Properties getProperties() throws IOException { // classe usada para uarmos o arquivo .properties
        Properties prop = new Properties();
        String caminho = "/conexao.properties"; // geralmente esse arquivo fica na pasta do usuário, ou seja, fora do projeto
        prop.load(FabricaConexao.class.getResourceAsStream(caminho)); // o método getResourcesAsStream() é o responsável por ler o arquivo
        return prop;
    }

}
