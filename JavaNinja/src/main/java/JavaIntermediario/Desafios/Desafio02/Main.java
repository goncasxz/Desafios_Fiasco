package JavaIntermediario.Desafios.Desafio02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NinjaAvancado Naruto = new NinjaAvancado("Naruto Uzumaki", 18 ,TipoHabilidade.NINJUSTU, "Rasengan", "Vento");
        NinjaAvancado Sasuke = new NinjaAvancado("Sasuke Uchiha", 18 ,TipoHabilidade.NINJUSTU, "Chidori", "Fogo/Relampago");
        NinjaAvancado Sakura = new NinjaAvancado("Sakura Haruno", 18 ,TipoHabilidade.NINJUSTU, "Cura", "Curar");
        NinjaBasico Rock = new NinjaBasico("Rock Lee", 18, TipoHabilidade.TAIJUTSU, "Aumento do Chakra");
        NinjaAvancado Hinata = new NinjaAvancado("Hinata Hyuga", 18, TipoHabilidade.DOUJUSTU, "Byakugan", "Ver pontos de chakra");

        int user = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Qual ninja deseja ver as informações: ");
            System.out.println("1 - Naruto");
            System.out.println("2 - Sasuke");
            System.out.println("3 - Sakura");
            System.out.println("4 - Rock Lee");
            System.out.println("5 - Hinata");
            System.out.println("6 - Sair");
            user = scanner.nextInt();

            switch (user) {
                case 1:
                    Naruto.mostrarInformacoes();
                    Naruto.executarHabilidade();
                    break;
                case 2:
                    Sasuke.mostrarInformacoes();
                    Sasuke.executarHabilidade();
                    break;
                case 3:
                    Sakura.mostrarInformacoes();
                    Sakura.executarHabilidade();
                    break;
                case 4:
                    Rock.mostrarInformacoes();
                    Rock.executarHabilidade();
                    break;
                case 5:
                    Hinata.mostrarInformacoes();
                    Hinata.executarHabilidade();
                    break;
                case 6:
                    break;
            }

        } while (user != 6);
    }
}
