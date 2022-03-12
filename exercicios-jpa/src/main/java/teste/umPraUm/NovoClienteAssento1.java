package teste.umPraUm;

import infra.DAO;
import modelo.umPraUm.Assento;
import modelo.umPraUm.Cliente;

public class NovoClienteAssento1 {

    public static void main(String[] args) {

        Assento assento = new Assento("16A");
        Cliente cliente = new Cliente("Carlos", assento);

        DAO<Object> dao = new DAO<>();

        // como precisamos do assento existir pra cadastrar o cliente, precisamos cadastrar o assento primeiro, o inverso até funciona dentro do mesmo contexto transaciona, senão vai causar um erro
        dao.abrirT()
                .incluir(assento)
                .incluir(cliente)
                .fecharT()
                .fechar();


    }
}
