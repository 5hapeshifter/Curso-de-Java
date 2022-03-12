package treino.ObejtosMetodosAtributos;

public class LacosArraysObjetos2 {

    String nome;

    public LacosArraysObjetos2(String nome) {
        this.nome = nome;
    }

    public static LacosArraysObjetos2 criarObjeto2(String nome) {
        LacosArraysObjetos2 novo = new LacosArraysObjetos2(nome);
        return novo;
    }

    public String getNome() {
        return nome;
    }
}
