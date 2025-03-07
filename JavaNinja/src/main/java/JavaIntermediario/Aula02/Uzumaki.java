package JavaIntermediario.Aula02;

public class Uzumaki extends Ninja {

    Biju biju;

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoes, NivelNinja rank, Biju biju) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
        this.biju = biju;
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu ataque uzumaki, de ar");
    }

}
