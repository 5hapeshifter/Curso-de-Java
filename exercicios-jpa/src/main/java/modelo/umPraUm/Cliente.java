package modelo.umPraUm;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = {CascadeType.PERSIST}) // estamos estabelecendo uma relação um pra um, e o próprio framework capta o id/pk da entidade, a propriedade cascade faz a persistência dos dados em cascata salvando os objetos na ordem correta, de modo que não da erro se tentarmos salvar a informação de um objeto que não existe ainda
    @JoinColumn(name = "assento_id", unique = true) // A anotação @JoinColumn é uma anotação específica para mapear campos que representam junção de tabela
    private Assento assento;

    public Cliente() {
    }

    public Cliente(String nome, Assento assento) {
        this.nome = nome;
        this.assento = assento;
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

    public Assento getAssento() {
        return assento;
    }

    public void setAssento(Assento assento) {
        this.assento = assento;
    }
}
