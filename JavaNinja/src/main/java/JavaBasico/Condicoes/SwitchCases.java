package JavaBasico.Condicoes;

import java.util.Scanner;

public class SwitchCases {
    public static void main(String[] args) {
        /*
        * Servem para gerar casos especificos
        *
        * */

        Scanner object = new Scanner(System.in);
        System.out.println("Escolha um personagem");
        System.out.println("1- Naruto Uzumaki");
        System.out.println("2- Sasuke Uchiha");
        System.out.println("3- Sakura Haruno");

        int user = object.nextInt();

        System.out.println("Voce digitou o numero: " + user);
        switch (user) {
            case 1:
                System.out.println("Personagem: Naruto Uzumaki");
                break;

            case 2:
                System.out.println("Personagem: Sasuke Uchiha");
                break;

            case 3:
                System.out.println("Personagem: Sakura Haruno");
                break;

            default:
                System.out.println("Input incorreto");
                break;
        }

        object.close();
    }
}
