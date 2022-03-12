package teste.umPraMuitos;

import infra.DAO;
import modelo.umPraMuitos.ItemPedido;
import modelo.umPraMuitos.Pedido;

public class ObterPedido {

    public static void main(String[] args) {

        DAO<Pedido> dao = new DAO<>(Pedido.class);

        Pedido pedido = dao.obterPorID(1L);
        dao.fechar();

        for (ItemPedido item : pedido.getItens()) {
            System.out.println(item.getQuantidade());
            System.out.println(item.getProduto().getNome());
        }

    }
}
