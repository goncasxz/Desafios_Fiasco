package JavaIntermediario.Aula08;

public class Main {
    public static void main(String[] args) {

        BolsaNinja<Object> bolsaNinja = new BolsaNinja<>();
        bolsaNinja.adicionarFerramenta(new Kunai("Kunai explosiva"));
        bolsaNinja.adicionarFerramenta(new Shuriken(3));
        bolsaNinja.adicionarFerramenta(new Pergaminho("Invocação do Sapo"));
        bolsaNinja.adicionarFerramenta(new CompanheiroNinja("Gamakichi"));

        System.out.println("Itens da nossa bolsa ninja: ");
        bolsaNinja.mostrarFerramenta();
    }
}
