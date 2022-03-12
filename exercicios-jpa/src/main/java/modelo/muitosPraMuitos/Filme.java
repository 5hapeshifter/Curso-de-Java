package modelo.muitosPraMuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "filmes")
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private Double nota;

    @ManyToMany(cascade = CascadeType.PERSIST) // Aqui estamos determinando que sempre que for gerado um Filme, será gerado um Ator automaticamente
    @JoinTable(
            name = "atores_filmes",
            joinColumns = @JoinColumn(name="filme_id", referencedColumnName = "id"), // Em joinColumns estamos mapeando os dados da tabela atual e principal, no caso criaremos uma coluna "filme_id" com os dados da coluna id dessa tabela
            inverseJoinColumns = @JoinColumn(name = "ator_id", referencedColumnName = "id") // Em inverseJoinColumns muda apenas que estamos fazendo da tabela da relação bidirecional
    )
    private List<Ator> atores;

    public Filme() {

    }

    public Filme(String nome, Double nota) {
        this.nome = nome;
        this.nota = nota;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public List<Ator> getAtores() {
        if (atores == null) {
            atores = new ArrayList<>();
        }
        return atores;
    }

    public void setAtores(List<Ator> atores) {
        this.atores = atores;
    }

    public void adicionarAtor(Ator ator) {
        if (ator != null && !getAtores().contains(ator)) {
            getAtores().add(ator);

            if (!ator.getFilmes().contains(this)) {
                ator.getFilmes().add(this);

            }
        }
    }
}
