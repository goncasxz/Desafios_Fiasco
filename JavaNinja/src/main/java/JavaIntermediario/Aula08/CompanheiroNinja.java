package JavaIntermediario.Aula08;

public class CompanheiroNinja {
    private String nomeDoAnimal;

    public CompanheiroNinja(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    public String getNomeDoAnimal() {
        return nomeDoAnimal;
    }

    public void setNomeDoAnimal(String nomeDoAnimal) {
        this.nomeDoAnimal = nomeDoAnimal;
    }

    @Override
    public String toString() {
        return "Nome do companheiro: " + nomeDoAnimal;
    }
}
