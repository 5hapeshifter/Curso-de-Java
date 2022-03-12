package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AlterarUsuario2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //Usamos Entity Manager Factory para criar um novo Entity Manager
        EntityManager em = emf.createEntityManager(); // Entity manager é onde ficam os dados para fazer a conexão com o BD

        em.getTransaction().begin();

        // As alterações são efetivadas pq quando usamos o método find(consulta), o objeto é mapeado e fica em estado gerenciado, ou seja, qualquer alteração feita nele, será efetivada, mesmo não usando o merge
        Usuario usuario = em.find(Usuario.class, 8L);
        usuario.setNome("Leonardo Leitao");

        //em.merge(usuario); // para fazer alterações, devemos utilizar o merge, não o persist

        em.getTransaction().commit();

        em.close();
        emf.close();


    }
}
