package teste.basico;

import modelo.basico.Usuario;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class NovoUsuario {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("exercicios-jpa"); //Usamos Entity Manager Factory para criar um novo Entity Manager
        EntityManager em = emf.createEntityManager(); // Entity manager é onde ficam os dados para fazer a conexão com o BD

        Usuario novoUsuario = new Usuario("Leonardo", "leonardo@lanche.com.br");

        em.getTransaction().begin(); // Precisamos iniciar uma transação para poder salvar os dados no BD
        em.persist(novoUsuario); // método para gravar os dados no banco
        em.getTransaction().commit(); // Aqui estamos confirmando que as informações devem ser gravadas

        System.out.println("O Id gerado foi " + novoUsuario.getId());

        em.close();
        emf.close();
    }
}
