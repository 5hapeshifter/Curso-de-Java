package modelo.heranca;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED) // Anotação que devemos colocar quando tiver herança, as tabelas serão geradas conforme a estratégia que estabelecermos
@DiscriminatorColumn(name = "tipo", length = 2, discriminatorType = DiscriminatorType.STRING) // devemos ser mais específico quando utilizarmos a estratégia de single e Joined table
@DiscriminatorValue("AL") // Quando algum aluno bolsista for instanciado, esse será o valor preenchido automaticamente
public class Aluno {

    @Id
    private Long matricula;

    private String nome;

    public Aluno() {
    }

    public Aluno(Long matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Long getMatricula() {
        return matricula;
    }

    public void setMatricula(Long matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
