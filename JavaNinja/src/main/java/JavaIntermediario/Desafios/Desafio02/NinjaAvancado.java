package JavaIntermediario.Desafios.Desafio02;

public class NinjaAvancado extends NinjaBasico implements Ninja{
    String especialidae;

    public NinjaAvancado() {
    }

    public NinjaAvancado(String nome, int idade, TipoHabilidade tipoHabilidade, String habilidade, String especialidae) {
        super(nome, idade, tipoHabilidade, habilidade);
        this.especialidae = especialidae;
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
    }

    @Override
    public void executarHabilidade() {
        super.executarHabilidade();
        System.out.println(this.especialidae);
    }
}
