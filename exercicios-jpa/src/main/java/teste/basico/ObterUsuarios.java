package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class ObterUsuarios {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //Usamos Entity Manager Factory para criar um novo Entity Manager
        EntityManager em = emf.createEntityManager(); // Entity manager é onde ficam os dados para fazer a conexão com o BD

        // JPQL significa java persistence query language, que é o JPA utiliza
        String jpql = "select u from Usuario u"; // Aqui temos que usar o nome da CLASSE, não o da tabela, o JPA converte o comando pra SQL automaticamente
        TypedQuery<Usuario> query = em.createQuery(jpql, Usuario.class);
        query.setMaxResults(5); // Sempre se atentar a fazer um select sem limite de retorno
        List<Usuario> usuarios = query.getResultList();

//        // forma de obter os resultados com uma linha de código
//        List<Usuario> usuarios = em
//                .createQuery("select u from Usuario u", Usuario.class)
//                .setMaxResults(5)
//                .getResultList();

        for (Usuario usuario : usuarios) {
            System.out.println("ID : " + usuario.getId() + " E-mail: " + usuario.getEmail());
        }

        em.close();
        emf.close();

    }
}
