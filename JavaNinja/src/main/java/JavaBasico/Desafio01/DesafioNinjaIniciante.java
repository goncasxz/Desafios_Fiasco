package JavaBasico.Desafio01;

public class DesafioNinjaIniciante {
    public static void main(String[] args) {
        /*
        * Nome, idade, missao (nome da missao, nivel de dificuldade, status)
        * */

        String ninja01 = "Naruto Uzumaki";
        int idadeNinja01 = 16;
        String missao01 = "Caçar a Akatsuki";
        char nivelMissao01 = 'S';
        String status01;

        String ninja02 = "Shikamaru";
        int idadeNinja02 = 15;
        String missao02 = "Garantir a segurança da vila";
        char nivelMissao02 = 'C';
        String status02;

        String ninja03 = "Sasuke Uchiha";
        int idadeNinja03 = 14;
        String missao03 = "Vingar o clã Uchiha";
        char nivelMissao03 = 'S';
        String status03;



        System.out.println("-----------------------");
        System.out.println("Ninja: " + ninja01 );
        System.out.println("Idade: " + idadeNinja01);
        System.out.println("Missão: " + missao01);
        System.out.println("Dificuldade: " + nivelMissao01);
        if (idadeNinja01 >= 15) {
            status01 = "Concluída";
        } else {
            if (nivelMissao01 == 'C' || nivelMissao01 == 'D') {
                status01 = "Concluída";
            } else {
                status01 = "Não Conclúida";
            }
        }
        System.out.println("Status: " + status01);

        System.out.println("-----------------------");
        System.out.println("Ninja: " + ninja02 );
        System.out.println("Idade: " + idadeNinja02);
        System.out.println("Missão: " + missao02);
        System.out.println("Dificuldade: " + nivelMissao02);
        if (idadeNinja02 >= 15) {
            status02 = "Concluída";
        } else {
            if (nivelMissao02 == 'C' || nivelMissao02 == 'D') {
                status02 = "Concluída";
            } else {
                status02 = "Não Conclúida";
            }
        }
        System.out.println("Status: " + status02);

        System.out.println("-----------------------");
        System.out.println("Ninja: " + ninja03 );
        System.out.println("Idade: " + idadeNinja03);
        System.out.println("Missão: " + missao03);
        System.out.println("Dificuldade: " + nivelMissao03);
        if (idadeNinja03 >= 15) {
            status03 = "Concluída";
        } else {
            if (nivelMissao03 == 'C' || nivelMissao03 == 'D') {
                status03 = "Concluída";
            } else {
                status03 = "Não Conclúida";
            }
        }
        System.out.println("Status: " + status03);

    }


}
