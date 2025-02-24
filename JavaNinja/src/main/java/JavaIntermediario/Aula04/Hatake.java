package JavaIntermediario.Aula04;

public class Hatake extends Ninja implements SharinganInterface, AnbuInterface{

    public void boasVindas() {
        System.out.println(nome + " Eu sou um Hatake");
    }

    @Override
    public void sharinganAtivado() {
        System.out.println(nome + " Sharingan Ativado");
    }

    @Override
    public void ninjaDeElite() {
        System.out.println("Sou da Anbu");
    }
}
