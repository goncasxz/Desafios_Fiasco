package JavaIntermediario.Aula02;

public class Main {
    public static void main(String[] args) {

        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 16;
        naruto.habilidadeEspecial();
        naruto.estrategiaDeBatalha();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;
        sasuke.habilidadeEspecial();

        Uchiha itachi = new Uchiha("Itachi Uchiha", "Aldeia da Folha", 27);
        itachi.metodoProvisorio();

        Uchiha madara = new Uchiha("Madara Uchiha", "Aldeira da Folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalha();
        //Metodo comum
        madara.inteligenciaDeCombate();
        //Metodo sobrescrito
        madara.inteligenciaDeCombate(200);

        System.out.println("-----------------------------------");
        System.out.println(naruto);
        System.out.println(sasuke);

    }
}
