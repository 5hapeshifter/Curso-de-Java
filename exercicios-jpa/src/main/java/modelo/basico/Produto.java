package modelo.basico;

import javax.persistence.*;

@Entity
@Table(name = "produtos", schema = "curso_java") // quando definimos o schema, estamos amarrando as consultas a uma forma específica de um banco de dados, não é usado normalmente
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "prod_nome", length = 200, nullable = false) // por padrão são 255 caracteres, aqui estamos definindo 200, nullable defini se o campo pode ser nulo ou não
    private String nome;

    // precision define o tamanho do número, incluindo as casas decimais e o scale é referente somente as casas decimais
    @Column(name = "prod_preco", nullable = false, precision = 11, scale = 2)
    private Double preco;

    public Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto() {
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

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
