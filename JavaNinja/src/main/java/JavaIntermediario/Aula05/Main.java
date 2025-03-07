package JavaIntermediario.Aula05;

public class Main {
    public static void main(String[] args) {

        Uzumaki Naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da FOlha", 17, 30, 1.65);
        System.out.println(Naruto.getNome());

        Missoes missao1 = new Missoes("Resgatar cachorro", RankDeMissoes.D);
        missao1.exibirDetalhes();

        Missoes missao2 = new Missoes("Derrotar Zabuza", RankDeMissoes.A);
        missao2.exibirDetalhes();
    }
}
