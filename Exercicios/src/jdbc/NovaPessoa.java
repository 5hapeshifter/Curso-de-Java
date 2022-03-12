package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome: ");
        String nome = entrada.nextLine();

        Connection conexao = FabricaConexao.getConexao();

//        String sql = "INSERT INTO pessoas (nome) Values ('" + nome + "')"; // Forma ruim de captar o dado e inserir na tabela, vulnerável a sofrer ataques de SQL injection
        String sql = "INSERT INTO pessoas (nome) Values (?)"; // forma ideal usando o PreparedStatement
        PreparedStatement stmt = conexao.prepareStatement(sql);
        // como definimos como auto increment o id, não precisamos altear o primeiro parametro do SetString, ele continuará contando a partir do maior Id
        stmt.setString(1, nome); // esse método garante que o usuário está informando uma String para ser inserida, não um comando

        stmt.execute();

        System.out.println("Pessoa incluída com sucesso!");
        entrada.close();
    }

}
