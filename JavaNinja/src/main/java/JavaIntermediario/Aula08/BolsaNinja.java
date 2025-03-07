package JavaIntermediario.Aula08;

import java.util.ArrayList;
import java.util.List;

public class BolsaNinja<T> {
    //TODO inicilizar o array
    private List<T> ferramentas;

    //Constructor
    public BolsaNinja() {
        this.ferramentas = new ArrayList<>();
    }

    //TODO colocar ferramentas no nosso array
    public void adicionarFerramenta(T ferramenta) {
        ferramentas.add(ferramenta);
    }

    //TODO mostrar ferramenta
    public void mostrarFerramenta() {
        for (T ferramenta : ferramentas) {
            System.out.println(ferramenta);
        }
    }
}
