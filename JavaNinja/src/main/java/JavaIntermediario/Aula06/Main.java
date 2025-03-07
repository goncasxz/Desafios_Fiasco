package JavaIntermediario.Aula06;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> ninjasList = new ArrayList<>();

        // Adiciona na Lista
        ninjasList.add("Naruto Uzumaki"); // index 0
        ninjasList.add("Sasuke Uchiha"); // index 1
        ninjasList.add("Sakura Haruno"); // index 2
        ninjasList.add("Tobirama Senju"); // index 3
        ninjasList.add("Kakashi Hatake"); // index 4
        
        System.out.println("Ninjas list = " + ninjasList);

        // Remove na Lista
        ninjasList.remove("Tobirama Senju");

        System.out.println("Ninjas list = " + ninjasList);

        // Troca o index selecionado
        ninjasList.set(3, "Hashirama Senju");

        // Ver tamanho lista
        System.out.println("Tamanho lista: " + ninjasList.size());
    }
}
