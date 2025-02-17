package JavaIntermediario.Aula01;

public class Boruto extends Uzumaki implements HyugaUzumaki{

    @Override
    public void AtivarOKarma() {
        System.out.println("O karma foi ativado, Sou Hyuga e Uzumaki");
    }

    @Override
    public void AtivarJougan() {
        System.out.println("Jougan foi ativado! Sou Hyuga e Uzumaki");
    }
}
