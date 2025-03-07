package JavaIntermediario.Desafios.Desafio04;

import java.util.Scanner;

public class Ninja {

    private String nome;
    private int idade;
    private String aldeia;

    public Ninja() {
    }

    public Ninja(String nome, int idade, String aldeia) {
        this.nome = nome;
        this.idade = idade;
        this.aldeia = aldeia;
    }

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

    public String getAldeia() {
        return aldeia;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void adicionarNinja() {
        Scanner object = new Scanner(System.in);
        System.out.println("Digite o nome do ninja: ");
        this.setNome(object.next());
        System.out.println("Digite a idade do ninja: ");
        this.setIdade(object.nextInt());
        System.out.println("Digite a aldeia do ninja: ");
        this.setAldeia(object.next());
    }

    public void mostrarInformacoes() {
        System.out.println("Idade: " + getIdade());
        System.out.println("Aldeia: " + getAldeia());
    }

    @Override
    public String toString() {
        return nome;
    }
}
