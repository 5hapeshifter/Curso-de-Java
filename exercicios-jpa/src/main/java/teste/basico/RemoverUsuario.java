package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class RemoverUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //Usamos Entity Manager Factory para criar um novo Entity Manager
        EntityManager em = emf.createEntityManager(); // Entity manager é onde ficam os dados para fazer a conexão com o BD

        Usuario usuario = em.find(Usuario.class, 7L);

        if (usuario != null) {
            em.getTransaction().begin();
            em.remove(usuario);
            em.getTransaction().commit();
        }

        em.close();
        emf.close();
    }
}
