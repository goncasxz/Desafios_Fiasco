package JavaIntermediario.Aula01;

public class Main {
    public static void main(String[] args) {
        /*String nome = "Naruto Uzumaki";
        int idade = 18;
        String aldeia = "Aldeia da folha";*/


        /*Objeto 1*/
        Uchiha sasuke = new Uchiha();
        sasuke.setNome("Sasuke Uchiha");
        sasuke.setAldeia("Aldeia da Folha");
        sasuke.setIdade(18);
        sasuke.SharinganAtivado();

        /*Objeto 2*/
        Uzumaki naruto = new Uzumaki();
        naruto.setNome("Naruto Uzumaki");
        naruto.setAldeia("Aldeia da Folha");
        naruto.setIdade(17);
        naruto.modoSabio();

        /*Objeto 3*/
        Haruno sakura = new Haruno();
        sakura.setNome("Sakura Haruno");
        sakura.setAldeia("Aldeia da Folha");
        sakura.setIdade(18);
        sakura.ativarCura();



    }
}
