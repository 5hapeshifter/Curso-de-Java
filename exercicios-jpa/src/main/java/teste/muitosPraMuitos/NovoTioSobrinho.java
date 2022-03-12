package teste.muitosPraMuitos;

import infra.DAO;
import modelo.muitosPraMuitos.Sobrinho;
import modelo.muitosPraMuitos.Tio;

public class NovoTioSobrinho {

    public static void main(String[] args) {

        Tio tia1 = new Tio("Maria");
        Tio tio2 = new Tio("João");
        Sobrinho sobrinho1 = new Sobrinho("Davi");
        Sobrinho sobrinha2 = new Sobrinho("Ana");

        /*
         Sempre que tivermos uma relação muitos pra muitos, precisamos refletir isso na tabela para manter a consistência dos dados,
         de modo que se um tio tem muitos sobrinhos e um sobrinho tem muitos tios, precisamos gravar os dados nos dois
         */
        tia1.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tia1);

        tia1.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tia1);

        tio2.getSobrinhos().add(sobrinho1);
        sobrinho1.getTios().add(tio2);

        tio2.getSobrinhos().add(sobrinha2);
        sobrinha2.getTios().add(tio2);

        DAO<Object> dao = new DAO<>();

        dao.abrirT()
                .incluir(tia1)
                .incluir(tio2)
                .incluir(sobrinho1)
                .incluir(sobrinha2)
                .fecharT()
                .fechar();

    }
}
