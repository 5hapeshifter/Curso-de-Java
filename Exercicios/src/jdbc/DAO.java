package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DAO { //padrão para aplicações que utilizam persistência de dados, onde tem a separação das regras de negócio das regras de acesso a banco de dados

    private Connection conexao;

    public int incluir(String sql, Object... atributos){
        try {
            PreparedStatement stmt = getConexao().prepareStatement(sql,PreparedStatement.RETURN_GENERATED_KEYS); // com o return a gente consegue pegar as chaves geradas
            adicionarAtributos(stmt, atributos);
            if(stmt.executeUpdate() > 0){
                ResultSet resultado = stmt.getGeneratedKeys();
                if(resultado.next()) {
                    return resultado.getInt(1); // estamos retornando o valor do Id, caso tenha sido cadastrado, indicando o indice da coluna
                }
            }
            return -1;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void closeConexao(){
        try {
            getConexao().close();
        } catch (SQLException e) {
            conexao = null;
        }
    }

    private void adicionarAtributos(PreparedStatement stmt, Object [] atributos) throws SQLException {
        int indice = 1;
        for (Object atributo : atributos) {
            if (atributo instanceof String) {
                stmt.setString(indice, (String) atributo);
            } else if(atributo instanceof Integer){
                stmt.setInt(indice, (Integer) atributo);
            }
            indice ++;
        }

    }

    private Connection getConexao() throws SQLException {
        try {
            if (conexao != null && !conexao.isClosed()) {
                return conexao;
            }
        } catch (SQLException e) {

        }
        conexao = FabricaConexao.getConexao();
        return conexao;
    }

}
