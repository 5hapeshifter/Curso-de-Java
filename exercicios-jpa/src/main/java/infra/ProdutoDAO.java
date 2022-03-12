package infra;

import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto> {

    public ProdutoDAO() {
        // estamos chamando o construtor da classe superior
        super(Produto.class);
    }
}
