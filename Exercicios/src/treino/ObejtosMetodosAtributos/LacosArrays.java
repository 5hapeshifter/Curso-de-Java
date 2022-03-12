package treino.ObejtosMetodosAtributos;

import java.util.ArrayList;
import java.util.List;

public class LacosArrays {

	public static void main(String[] args) {

		List<LacosArraysObjetos1> objetos1 = new ArrayList<>();
		List<LacosArraysObjetos2> objetos2 = new ArrayList<>();
		List<Object> objetos = new ArrayList<>();

//		objetos1.add(LacosArraysObjetos1.criarObjeto1("aqui carai"));
//		objetos1.add(LacosArraysObjetos1.criarObjeto1("asfasfd"));
//		objetos1.add(LacosArraysObjetos1.criarObjeto1("qerqwre"));

		objetos2.add(LacosArraysObjetos2.criarObjeto2("sdqwreqwer"));
		objetos2.add(LacosArraysObjetos2.criarObjeto2("dghdfghdfg"));
		objetos2.add(LacosArraysObjetos2.criarObjeto2("ytuityiuty"));


		objetos.addAll(objetos1);

		//objetos1.stream().forEach(e -> objetos.add(e));
		System.out.println(objetos.size());
		LacosArraysObjetos1 x = new LacosArraysObjetos1();
		//x = (LacosArraysObjetos1) objetos.get(2);
		System.out.println( x.getNome());
		objetos.forEach(e -> System.out.println());

	}
}
