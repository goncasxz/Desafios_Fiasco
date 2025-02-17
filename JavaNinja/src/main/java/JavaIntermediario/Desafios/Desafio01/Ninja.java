package JavaIntermediario.Desafios.Desafio01;

import java.util.Scanner;

public class Ninja {
    private String nome;
    private int idade;
    private String missao;
    private String nivelDificuldade;
    private String statusMissao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getMissao() {
        return missao;
    }

    public void setMissao(String missao) {
        this.missao = missao;
    }

    public String getNivelDificuldade() {
        return nivelDificuldade;
    }

    public void setNivelDificuldade(String nivelDificuldade) {
        this.nivelDificuldade = nivelDificuldade;
    }

    public String getStatusMissao() {
        return statusMissao;
    }

    public void setStatusMissao(String statusMissao) {
        this.statusMissao = statusMissao;
    }

    public void mostrarInformacoes() {
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Missão: " + getMissao());
        System.out.println("Nivel de dificuldade: " + getNivelDificuldade());
        System.out.println("Status da missao: " + getStatusMissao());
    }

    public void adicionarNinja() {
        Scanner object = new Scanner(System.in);
        System.out.println("Digite o nome do ninja: ");
        this.setNome(object.next());
        System.out.println("Digite a idade do ninja: ");
        this.setIdade(object.nextInt());
        System.out.println("Digite a missão do ninja: ");
        this.setMissao(object.next());
        System.out.println("Digite o nivel de dificuldade: ");
        this.setNivelDificuldade(object.next());
        System.out.println("Digite o status da missão: ");
        this.setStatusMissao(object.next());
    }
}