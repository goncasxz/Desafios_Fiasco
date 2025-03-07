package JavaIntermediario.Aula02;

public class Uchiha extends Ninja implements SharinganInterface{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoes, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoes, rank);
    }

    /*
    * Metodo:
    * Implementa da interface Sharingan
    * */
    @Override
    public void sharinganAtivda() {
        System.out.println(nome + ": Ativou sharingan");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + this.nome + " e esse é meu ataque uchiha, de fogo");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println(nome + " Inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + "e voce é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + "e voce é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + "e voce precisa treinar mais");
        }
    }


    //CONVENÇÃO UTILIZAR OVERRIDE | PADRONIZAÇÃO | EVITAR ERROS
    @Override
    public void metodoProvisorio() {
        System.out.println("TESTE NA CLASSE UCHIHA");
    }

}
