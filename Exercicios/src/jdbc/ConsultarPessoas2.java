package jdbc;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {

    public static void main(String[] args) throws SQLException {

        Scanner entrada = new Scanner(System.in);

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas WHERE nome like ?";

        System.out.println("Informe o valor para pesquisa: ");
        String valor = entrada.nextLine();

        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + valor + "%"); // aqui é onde fazemos a substituição do "?" pelo texto que configuramos
        ResultSet resultado = stmt.executeQuery(); // esse método executeQuery retorna um resultSet, a partir dele conseguimos captar as informações obtidas na consulta

        List<Pessoa> pessoas = new ArrayList<>();

        while(resultado.next()){
            int codigo = resultado.getInt("codigo"); // aqui informamos o nome da coluna da qual queremos pegar o dado
            String nome = resultado.getString("nome"); // aqui informamos o nome da coluna da qual queremos pegar o dado
            pessoas.add(new Pessoa(codigo, nome));
        }

        for(Pessoa  p : pessoas){
            System.out.println(p.getCodigo() + " => " + p.getNome());
        }

        stmt.close();
        conexao.close();
        entrada.close();
    }
}
