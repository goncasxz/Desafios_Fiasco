package JavaIntermediario.Aula11;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Naruto");
        linkedList.add("Sasuke");
        linkedList.add("Sakura");

        System.out.println(linkedList);

        linkedList.add(1, "Kakashi Hatake");

        System.out.println(linkedList);
    }
}
