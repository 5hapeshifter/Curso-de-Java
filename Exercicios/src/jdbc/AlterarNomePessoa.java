package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarNomePessoa {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o código da pessoa: ");
        int codigo = entrada.nextInt();

        String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        Connection conexao = FabricaConexao.getConexao();
        PreparedStatement stmt = conexao.prepareStatement(selectSQL);
        stmt.setInt(1, codigo);
        ResultSet resultado = stmt.executeQuery(); // esse método executeQuery retorna um resultSet, a partir dele conseguimos captar as informações obtidas na consulta

        if (resultado.next()) {
            Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2)); // aqui é onde informamos as colunas e seus tipos

            System.out.println("O nome atual é " + p.getNome());
            entrada.nextLine();

            System.out.println("Informe o novo nome: ");
            String novoNome = entrada.nextLine();

            stmt.close();

            stmt = conexao.prepareStatement(updateSQL);
            stmt.setString(1, novoNome); // Parâmetro 1(primeira "?") vai ser substituído pelo novoNome
            stmt.setInt(2, codigo); // Parâmetro 2(segunda "?") vai ser substituído pelo codigo
            stmt.execute(); // esse método efetiva a mudança no banco de dados

            System.out.println("Pessoa alterada com sucesso!");
        } else {
            System.out.println("Pessoa não encontrada!");
        }

        conexao.close();
        entrada.close();
    }

}
