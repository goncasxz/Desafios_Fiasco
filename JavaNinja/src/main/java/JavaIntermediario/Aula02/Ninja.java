package JavaIntermediario.Aula02;

public abstract class Ninja implements EstrategiaBatalha {

    //TODO: Incluir 2 novos atributos: numeroDeMissoes, Rank
    //TODO: Rank: Gennin, Chun, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoes;
    NivelNinja rank;



    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    //TODO: Sobrecarga construtor chamando novos atributos


    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoes, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoes = numeroDeMissoes;
        this.rank = rank;
    }

    // Metodo geral
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu ataque especial");
    }

    @Override
    public void estrategiaDeBatalha() {
        System.out.println("Essa é minha estrategia de combate");
    }

    // Inteligencia de Combate metodo padrão
    public void inteligenciaDeCombate() {
        System.out.println(nome + " Inteligencia de combate");
    }

    // SOBRECARGA DE METODO - Inteligencia de Combate
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + " e voce é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + " e voce é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + " e voce precisa treinar mais");
        }
    }

    //MEOTODO SEM OVERRID
    public void metodoProvisorio(){
        System.out.println("TESTE");
    }

    @Override
    public String toString() {
        return "Meu nome é " + nome + " eu sou da aldeia " + aldeia + " e tenho " +  idade + " anos";
    }
}
