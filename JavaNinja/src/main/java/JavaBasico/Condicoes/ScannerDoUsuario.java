package JavaBasico.Condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.print("Escreva o nome do ninja: ");
        String nomeNinja = caixaDeTexto.nextLine();

        System.out.print("Escreva a idade do ninja: ");
        int idadeNinja = caixaDeTexto.nextInt();

        caixaDeTexto.close();

        System.out.println(nomeNinja);
        System.out.println(idadeNinja);
    }
}
