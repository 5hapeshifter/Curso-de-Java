package br.com.cod3r.exerciciossb.model.repositories;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

public interface ProdutoRepository
        extends PagingAndSortingRepository<Produto, Integer> {

    public Iterable<Produto> findByNomeContainingIgnoreCase(String parteNome); // pela convenção, precisamos colocar exatamente o mesmo nome do atributo para que o método seja implementado automaticamente, podemos adicionar o IgnoreCase para ele buscar independente de estar maiuscula ou minuscula

//    Possibilidades de uso
//    findByNomeContaining
//    findByNomeIsContaining
//    findByNomeContains
//
//    findByNomeStartsWith
//    findByNomeEndsWith
//
//    findByNomeNotContaining

    @Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
    public Iterable<Produto> searchByNameLike(@Param("nome") String nome);

}
