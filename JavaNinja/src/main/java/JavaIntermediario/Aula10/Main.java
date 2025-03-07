package JavaIntermediario.Aula10;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Array
        System.out.println("-------------------ARRAY----------------------");
        String[] ninjasArray = new String[3];
        ninjasArray[0] = "Naruto";
        ninjasArray[1] = "Sasuke";
        ninjasArray[2] = "Sakura";
        for (int i = 0; i < ninjasArray.length; i++) {
            System.out.println("Index [" + i + "] = " + ninjasArray[i]);
        }

        // List
        System.out.println("-------------------LIST----------------------");
        List<String> ninjasList = new ArrayList<>();
        ninjasList.add("Naruto");
        ninjasList.add("Sasuke");
        ninjasList.add("Sakura");
        ninjasList.add("Kakashi");
        System.out.println("Lista: " + ninjasList);


        // Stack
        System.out.println("-------------------STACK----------------------");
        Stack<String> ninjasStack = new Stack<>();
        ninjasStack.push("Naruto");
        ninjasStack.push("Sasuke");
        ninjasStack.push("Sakura");
        System.out.println("Stack  atual: " + ninjasStack);
        System.out.println("Tamanho da Stack atual: " + ninjasStack.size());
        System.out.println("Stack topo atual: " + ninjasStack.peek());
        ninjasStack.pop();
        System.out.println(" ");
        System.out.println("Stack após uma remoção: " + ninjasStack);
        System.out.println("Stack topo após uma remoção: " + ninjasStack.peek());
        ninjasStack.pop();
        System.out.println(" ");
        System.out.println("Stack  após 2 remoções: " + ninjasStack);
        System.out.println("Stack após 2 remoções: " + ninjasStack.peek());
        System.out.println("Tamanho da Stack após 2 remoções: " + ninjasStack.size());

        // QUEUE
        System.out.println("-------------------QUEUE----------------------");
        Queue<String> ninjasQueue = new LinkedList<>();
        ninjasQueue.add("Naruto");
        ninjasQueue.add("Sasuke");
        ninjasQueue.add("Sakura");
        ninjasQueue.add("Kakashi");
        ninjasQueue.add("Shikamaru");

        // Mostrar fila
        System.out.println("Ninjas na fila: " + ninjasQueue);


        // Tirar um ninja da fila
        ninjasQueue.poll();
        System.out.println("Ninjas na fila depois do poll: " + ninjasQueue);


        // Como ver a primeira posição (HEAD)
        System.out.println(" ");
        System.out.println("Ninja no HEAD: " + ninjasQueue.peek());

        // Adicionar mais na fila
        System.out.println(" ");
        ninjasQueue.add("Hashirama Senju");
        ninjasQueue.add("Tobirama Senju");
        System.out.println("Ninjas atual na fila: " + ninjasQueue);

        // NÃO É POSSIVEL DELETAR O TAIL

        // Esvaziar a fila
        while (!ninjasQueue.isEmpty()) {
            System.out.println("Retirando o " + ninjasQueue.peek());
            ninjasQueue.poll();
            System.out.println("Fila atual: " + ninjasQueue);
            System.out.println("------------------------------");
        }

        // Verificar se está vazia a fila
        if (ninjasQueue.isEmpty()) {
            System.out.println("A fila está vazia");
        }
    }
}
