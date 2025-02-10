package JavaBasico.Desafio02;

import java.util.Scanner;

public class MenuNinjas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int user;
        int bound;
        int ninjaRegister = 0;


        System.out.println("Digite a quantia máxima de ninjas a serem armazenados: ");
        bound = scanner.nextInt();
        String[] ninjaArray = new String[bound];

        do {
            System.out.println("\n===== Menu Ninja =====");
            System.out.println("1. Cadastrar Ninja");
            System.out.println("2. Listar Ninjas");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            user = scanner.nextInt();

            switch (user){
                case 1:
                    System.out.println("\n");
                    if (ninjaRegister >= bound) {
                        System.out.println("Numero maximo de ninjas excedido");
                    } else {
                        System.out.println("Digite o nome do ninja a ser cadastrado: ");
                        ninjaArray[ninjaRegister] = scanner.next();
                        ninjaRegister++;
                    }
                    break;

                case 2:
                    System.out.println("\n");
                    if (ninjaRegister == 0) {
                        System.out.println("Sem ninjas cadastrados");
                    } else {
                        for (int i = 0; i < ninjaArray.length; i++) {
                            System.out.println(ninjaArray[i]);
                        }
                    }
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Tipo de dado invalido");
                    break;
            }

        } while (user != 3);

        System.out.println("Saindo do programa, obrigado por utilizar");
        scanner.close();
    }
}
