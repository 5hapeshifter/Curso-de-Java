package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConsultarPessoas1 {

    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConexao();
        String sql = "SELECT * FROM pessoas";

        Statement stmt = conexao.createStatement();
        ResultSet resultado = stmt.executeQuery(sql); // esse método executeQuery retorna um resultSet, a partir dele conseguimos captar as informações obtidas na consulta

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

    }
}
