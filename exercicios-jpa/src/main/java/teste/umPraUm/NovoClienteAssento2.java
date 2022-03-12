package teste.umPraUm;

import infra.DAO;
import modelo.umPraUm.Assento;
import modelo.umPraUm.Cliente;

public class NovoClienteAssento2 {

    public static void main(String[] args) {

        Assento assento = new Assento("4d");
        Cliente cliente = new Cliente("Maria", assento);

        DAO<Cliente> dao = new DAO<>(Cliente.class);

        dao.incluirAtomico(cliente);

    }
}
