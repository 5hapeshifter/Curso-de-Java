package modelo.composicao;

import javax.persistence.Embeddable;

@Embeddable // Devemos utilizar a anotação @Embeddable quando não quisermos que seja gerado uma tabela de classe, de modo que outras continuarão podendo utilizar os atributos e essa classe normalmente
public class Endereco {

    private String logradouro;
    private String complemento;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
}