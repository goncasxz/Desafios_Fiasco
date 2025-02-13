package JavaIntermediario.Desafios.Desafio01;

import java.util.Scanner;

public class Uchiha extends Ninja{
    private String habilidadeEspecial;

    public String getHabilidadeEspecial() {
        return habilidadeEspecial;
    }

    public void setHabilidadeEspecial(String habilidadeEspecial) {
        this.habilidadeEspecial = habilidadeEspecial;
    }

    public void mostrarHabilidadeEspecial() {
        System.out.println("Ativando: " + getHabilidadeEspecial());
    }

    @Override
    public void mostrarInformacoes () {
        super.mostrarInformacoes();
        System.out.println("Habilidade especial: " + getHabilidadeEspecial());
    }

    public void adicionarNinja() {
        super.adicionarNinja();  // Chama a implementação da classe pai
        Scanner object = new Scanner(System.in);
        System.out.print("Digite a habilidade especial do uchiha: ");
        this.setHabilidadeEspecial(object.next());
    }
}
