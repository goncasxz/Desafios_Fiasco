package JavaBasico.Condicoes;

public class IfElse {
    public static void main(String[] args) {

        /*
        * objetivo: passar ninja de nivel de acordo com o numero de missoes
        * */

        String nome = "Naruto";
        int idade = 16;
        boolean hokage = false;
        short numeroDeMissoes = 14;

        if(numeroDeMissoes > 10 && idade > 15){
            System.out.println("Naruto esta pronto para passar de nivel");
        } else {
            System.out.println("Nauro nao completou numero de missoes minimo");
        }
    }
}
