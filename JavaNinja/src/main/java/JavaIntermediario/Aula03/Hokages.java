package JavaIntermediario.Aula03;

public abstract class Hokages {
    String nome;
    int idade;
    boolean vivoOuNao;

    public Hokages() {

    }

    public Hokages(String nome) {
        this.nome = nome;
    }

    public Hokages(int idade) {
        this.idade = idade;
    }

    public Hokages(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }
}
