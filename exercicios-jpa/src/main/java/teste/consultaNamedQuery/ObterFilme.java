package teste.consultaNamedQuery;

import infra.DAO;
import modelo.muitosPraMuitos.Filme;

import java.util.List;

public class ObterFilme {

    public static void main(String[] args) {

        DAO<Filme> dao = new DAO<>(Filme.class);
        List<Filme> filmes = dao.consultar(
                "obterFilmesComNotaMaiorQue", "nota", 8.5);

        for (Filme filme : filmes) {
            System.out.println(filme.getNome());
        }

    }
}
