package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario1 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //Usamos Entity Manager Factory para criar um novo Entity Manager
        EntityManager em = emf.createEntityManager(); // Entity manager é onde ficam os dados para fazer a conexão com o BD

        em.getTransaction().begin();

        Usuario usuario = em.find(Usuario.class, 8L);
        usuario.setNome("Leo");
        usuario.setEmail("leo@lanche.com.br");
        em.merge(usuario); // para fazer alterações, devemos utilizar o merge, não o persist
        em.getTransaction().commit();

        em.close();
        emf.close();

    }
}
