package br.com.cod3r.exerciciossb.controllers;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

//    @PostMapping
    @RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT}) // Usando o RequestMapping dessa forma e, tendo em vista que os dois métodos fazem a mesma coisa, podemos deixar um método com a função de PUT e POST
    public @ResponseBody Produto salvarProduto(@Valid Produto produto) { // com a anotação @ResponseBody estamos declarando que o objeto faz parte do corpo da resposta
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos() {
        return produtoRepository.findAll();
    }

    @GetMapping(path = "/nome/{parteNome}")
    public Iterable<Produto> obterProdutosPorNome(@PathVariable String parteNome) {
//        return produtoRepository.findByNomeContainingIgnoreCase(parteNome);
        return produtoRepository.searchByNameLike(parteNome);
    }

    @GetMapping(path = "/pagina/{numeroPagina}/{qtdePagina}")
    public Iterable<Produto> obterProdutosPorPagina(
            @PathVariable int numeroPagina,@PathVariable int qtdePagina) {
        if(qtdePagina >= 5) qtdePagina = 5;
        Pageable pageable = PageRequest.of(numeroPagina, qtdePagina);
        return produtoRepository.findAll(pageable);
    }

    @GetMapping(path = "/{id}")
    public Optional<Produto> obterProdutoPorId(@PathVariable int id) {
        return produtoRepository.findById(id);
    }

//    @PutMapping
//    public Produto alterarProduto(@Valid Produto produto) {
//        produtoRepository.save(produto);
//        return produto;
//    }

    @DeleteMapping(path = "/{id}")
    public void excluirProduto(@PathVariable int id) {
        produtoRepository.deleteById(id);
    }



}
