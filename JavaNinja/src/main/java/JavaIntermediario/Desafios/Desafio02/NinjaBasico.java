package JavaIntermediario.Desafios.Desafio02;

public class NinjaBasico implements Ninja {
    String nome;
    int idade;
    TipoHabilidade tipoHabilidade;
    String habilidade;

    public NinjaBasico() {
    }

    public NinjaBasico(String nome, int idade, TipoHabilidade tipoHabilidade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.tipoHabilidade = tipoHabilidade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("Meu nome é " + this.nome + " minha habilidade " + this.habilidade + " é do tipo: " + this.tipoHabilidade);
    }


}
