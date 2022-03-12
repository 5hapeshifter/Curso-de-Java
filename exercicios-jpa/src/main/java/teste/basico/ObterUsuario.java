package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ObterUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //Usamos Entity Manager Factory para criar um novo Entity Manager
        EntityManager em = emf.createEntityManager(); // Entity manager é onde ficam os dados para fazer a conexão com o BD

        // Não precisamos criar uma transação para fazer uma consulta
        Usuario usuario = em.find(Usuario.class, 8L);
        //System.out.println(usuario.getNome());

        em.close();
        emf.close();
    }
}
