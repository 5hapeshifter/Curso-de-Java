package teste.umPraUm;

import infra.DAO;
import modelo.umPraUm.Assento;
import modelo.umPraUm.Cliente;

public class ObterClienteAssento {

    public static void main(String[] args) {

        DAO<Cliente> daoCliente = new DAO<Cliente>(Cliente.class);

        Cliente cliente = daoCliente.obterPorID(1L);
        System.out.println(cliente.getAssento().getNome()); // aqui estamos pegando os atributos de um objeto a partir de outro objeto, pegando informações de assento a partir de cliente, que conseguimos fazer apenas por que mapeamos a relação bidirecional
        System.out.println(cliente.getAssento().getCliente().getNome());

        daoCliente.fechar();

        DAO<Assento> daoAssento = new DAO<Assento>(Assento.class);
        Assento assento = daoAssento.obterPorID(4L);
        System.out.println(assento.getCliente().getNome());

        daoAssento.fechar();

    }
}
