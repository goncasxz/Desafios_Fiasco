package JavaIntermediario.Aula02;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------NARUTO----------------");

        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da Folha", 16, 30, NivelNinja.CHUUNIN, Biju.KURAMA);
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();
        naruto.tacarKunai();
        System.out.println(naruto.biju);


        System.out.println("----------------SASUKE----------------");

        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da Folha", 18, 20, NivelNinja.GENIN);
        sasuke.habilidadeEspecial();

        System.out.println("----------------ITACHI----------------");

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27, 60, NivelNinja.JOUNIN);
        itachi.habilidadeEspecial();
        itachi.metodoProvisorio();

        System.out.println("\"----------------MADARA----------------\"");

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeira da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalha();

        madara.inteligenciaDeCombate();

        madara.inteligenciaDeCombate(200);

        System.out.println("-----------------------------------");
        System.out.println(naruto);
        System.out.println(sasuke);

    }
}
