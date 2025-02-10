package JavaBasico.Condicoes;

public class Ternarios {
    public static void main(String[] args) {
        /*
        * Maneira de reduzir o codigo
        * variavel = (condicao) ? valorSeVerdadeiro : valorSeFalso
        * */

        short numeroDeMissoes = 11;
        String nivel = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";
        System.out.println(nivel);
    }
}
