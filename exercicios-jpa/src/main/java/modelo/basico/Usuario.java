package modelo.basico;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // Por convenção o nome da tabele no banco de dados vai ser exatamente igual ao da classe
public class Usuario {
    //Por padrão, qualquer atributo da classe será mapeado para uma coluna.
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Aqui estamos definindo que terá uma sequencia só para essa entidade
    private Long id;

    private String nome;

    private String email;

    public Usuario() {
    }

    public Usuario(String nome, String email) {
        this.nome = nome;
        this.email = email;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
