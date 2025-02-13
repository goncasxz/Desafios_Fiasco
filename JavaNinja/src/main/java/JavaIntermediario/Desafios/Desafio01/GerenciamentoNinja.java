package JavaIntermediario.Desafios.Desafio01;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class GerenciamentoNinja {
    public static void main(String[] args) {
        int user;

        List<Ninja> ninjas = new ArrayList<>();
        List<Uchiha> uchihas = new ArrayList<>();

        Scanner scanner;
        do {
            System.out.println("\n");
            System.out.println("-----Menu-----");
            System.out.println("1 - Exibir informações dos ninjas");
            System.out.println("2 - Adicionar novos ninjas");
            System.out.println("3 - Atualizar habilidade especial");
            System.out.println("4 - Mostrar as informações do ninja");
            System.out.println("5 - Sair");
            System.out.println("Escolha uma opção: ");
            scanner = new Scanner(System.in);
            user = scanner.nextInt();
            scanner.nextLine();

            switch (user) {
                case 1:
                    System.out.println("\n");
                    if(ninjas.isEmpty() && uchihas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado");
                    } else {
                        System.out.println("Lista dos ninjas cadastrados: ");
                        for (int i = 0; i < ninjas.size(); i++){
                            System.out.println(i + " - " + ninjas.get(i).getNome());
                        }
                        System.out.println("Lista de Uchihas");
                        for (int i = 0; i < uchihas.size(); i++) {
                            System.out.println(i + " - " + uchihas.get(i).getNome());
                        }
                    }
                    break;
                case 2:
                    System.out.println("\n");
                    int ninjaType = 0;
                    do {
                        System.out.println("Qual tipo de ninja gostaria de adicionar");
                        System.out.println("1 - Ninja normal");
                        System.out.println("2- Uchiha");
                        ninjaType = scanner.nextInt();
                        scanner.nextLine();
                    } while (ninjaType != 1 && ninjaType != 2);
                    if (ninjaType == 1) {
                        Ninja novoNinja = new Ninja();
                        novoNinja.adicionarNinja();
                        ninjas.add(novoNinja);
                    } else {
                        Uchiha novoUchiha = new Uchiha();
                        novoUchiha.adicionarNinja();
                        uchihas.add(novoUchiha);
                    }
                    break;

                case 3:
                    System.out.println("\n");
                    if (uchihas.isEmpty()) {
                        System.out.println("Nenhum Uchiha cadastrado");
                        break;
                    }
                    System.out.println("Selecione um Uchiha para atualizar a habilidade especial:");
                    for (int i = 0; i < uchihas.size(); i++) {
                        System.out.println(i + " - " + uchihas.get(i).getNome());
                    }
                    System.out.print("Escolha o número do Uchiha: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    if (index >= 0 && index < uchihas.size()) {
                        System.out.print("Digite a nova habilidade especial: ");
                        String novaHabilidade = scanner.nextLine();
                        uchihas.get(index).setHabilidadeEspecial(novaHabilidade);
                        System.out.println("Habilidade especial atualizada com sucesso.");
                    } else {
                        System.out.println("Índice inválido.");
                    }
                    break;

                case 4:
                    System.out.println("\n");
                    if (ninjas.isEmpty() && uchihas.isEmpty()) {
                        System.out.println("Nenhum ninja cadastrado.");
                        break;
                    }
                    int escolha = 0;
                    do {
                        System.out.println("Qual tipo de ninja gostaria de visualizar informações");
                        System.out.println("1 - Ninja normal");
                        System.out.println("2- Uchiha");
                        escolha = scanner.nextInt();
                        scanner.nextLine();
                    } while (escolha != 1 && escolha != 2);
                    if (escolha == 1) {
                        if (ninjas.isEmpty()) {
                            System.out.println("Nenhum ninja normal cadastrado.");
                            break;
                        }
                        for (int i = 0; i < ninjas.size(); i++) {
                            System.out.println(i + " - " + ninjas.get(i).getNome());
                        }
                        System.out.print("Escolha o número do Ninja: ");
                        int ninjaIndex = scanner.nextInt();
                        scanner.nextLine();
                        if (ninjaIndex >= 0 && ninjaIndex < ninjas.size()) {
                            System.out.println("\n");
                            ninjas.get(ninjaIndex).mostrarInformacoes();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    } else {
                        if (uchihas.isEmpty()) {
                            System.out.println("Nenhum Uchiha cadastrado.");
                            break;
                        }
                        System.out.println("Selecione um Uchiha para ver as informações:");
                        for (int i = 0; i < uchihas.size(); i++) {
                            System.out.println(i + " - " + uchihas.get(i).getNome());
                        }
                        System.out.print("Escolha o número do Uchiha: ");
                        int uchihaIndex = scanner.nextInt();
                        scanner.nextLine();
                        if (uchihaIndex >= 0 && uchihaIndex < uchihas.size()) {
                            System.out.println("\n");
                            uchihas.get(uchihaIndex).mostrarInformacoes();
                        } else {
                            System.out.println("Índice inválido.");
                        }
                    }
                    break;


                case 5:
                    break;

            }
        } while (user != 5);
        System.out.println("\n");
        System.out.println("Programa fechado");
        scanner.close();

    }
}
