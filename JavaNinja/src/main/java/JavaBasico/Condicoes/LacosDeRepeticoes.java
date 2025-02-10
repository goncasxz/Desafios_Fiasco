package JavaBasico.Condicoes;

public class LacosDeRepeticoes {
    public static void main(String[] args) {

        int numeroDeClones = 0;
        int numeroMaxClones = 40;

        while (numeroDeClones < numeroMaxClones) {
            numeroDeClones++;
            System.out.println(numeroDeClones);
        }

        for (int i = 0; i < 40; i++) {
            numeroDeClones++;
            System.out.println(numeroDeClones);
        }


    }
}
