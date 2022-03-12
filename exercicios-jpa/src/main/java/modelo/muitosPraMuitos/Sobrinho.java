package modelo.muitosPraMuitos;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Sobrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @ManyToMany(mappedBy = "sobrinhos") // pelo atributo mappedBy a gente define onde está a relação principal, nesse caso está em Tio
    private List<Tio> tios = new ArrayList<>();

    public Sobrinho() {

    }

    public Sobrinho(String nome) {
        this.nome = nome;
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

    public List<Tio> getTios() {
        return tios;
    }

    public void setTios(List<Tio> tios) {
        this.tios = tios;
    }
}
