package treino.ObejtosMetodosAtributos;

public class LacosArraysObjetos1 {

    String nome;

    public LacosArraysObjetos1(String nome) {
        this.nome = nome;
    }

    public static LacosArraysObjetos1 criarObjeto1(String nome) {
         LacosArraysObjetos1 novo = new LacosArraysObjetos1(nome);
        return novo;

    }

    public LacosArraysObjetos1() {
    }

    public String getNome() {
        return nome;
    }
}
