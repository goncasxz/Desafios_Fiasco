package JavaIntermediario.Desafios.Desafio04;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedList<Ninja> linkedList = new LinkedList<>();
        int user;
        Ninja naruto = new Ninja("Naruto", 18, "Aldeia da Folha");
        Ninja sasuke = new Ninja("Sasuke", 18, "Aldeia da Folha");
        Ninja sakura = new Ninja("Sakura", 18, "Aldeia da Folha");
        Ninja kakashi = new Ninja("Kakashi", 43, "Aldeia da Folha");
        linkedList.add(naruto);
        linkedList.add(sasuke);
        linkedList.add(sakura);
        linkedList.add(kakashi);

        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("-----Menu-----");
            System.out.println("1 - Adicionar novo ninja");
            System.out.println("2 - Remover ninja");
            System.out.println("3 - Buscar Ninja");
            System.out.println("4 - Exibir lista");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            user = scanner.nextInt();
            scanner.nextLine();

            switch (user) {
                case 1:
                    Ninja novoNinja = new Ninja();
                    int escolha;
                    do {
                        System.out.println("Digite 1 para inserir no começo e 2 para inserir no final: ");
                        escolha = scanner.nextInt();
                        if (escolha != 1 && escolha != 2) {
                            System.out.println("Dado invalido");
                        }
                    } while (escolha != 1 && escolha != 2);
                    if (escolha == 1) {
                        novoNinja.adicionarNinja();
                        linkedList.add(0, novoNinja);
                    } else {
                        novoNinja.adicionarNinja();
                        linkedList.add(novoNinja);
                    }
                    System.out.println("\n");
                    break;
                case 2:
                    System.out.println("Qual index gostaria de remover: ");
                    int index;
                    index = scanner.nextInt();
                    if (index >= 0 && index < linkedList.size()) {
                        System.out.println("Ninja: " + linkedList.get(index) + " Removido");
                        linkedList.remove(index);
                    } else {
                        System.out.println("Indice invalido");
                    }
                    System.out.println("\n");
                    break;
                case 3:
                    System.out.println("Qual index gostaria de buscar: ");
                    index = scanner.nextInt();
                    if (index >=0 && index < linkedList.size()) {
                        Ninja ninjaBusca = linkedList.get(index);
                        System.out.println("Ninja encontrado: " + ninjaBusca.getNome());
                        ninjaBusca.mostrarInformacoes();
                    } else {
                        System.out.println("Indice invalido");
                    }
                    System.out.println("\n");
                    break;
                case 4:
                    for (int i = 0; i < linkedList.size(); i++) {
                        System.out.println(i + " - " + linkedList.get(i));
                    }
                    System.out.println("\n");
                    break;
                case 5:
                    break;
            }
        } while (user != 5);
        System.out.println("Obrigado por utilizar o programa!!!");
    }
}
