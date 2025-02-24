package JavaIntermediario.Aula04;

public class Uchiha extends Ninja implements SharinganInterface{

    @Override
    public void sharinganAtivado() {
        System.out.println("Sou um uchiha " + nome + " Sharingan");
    }
}
