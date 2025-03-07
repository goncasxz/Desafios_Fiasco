package JavaIntermediario.Aula09;

public record NinjaRecord(String nome, String email, int telefone) {

    // Todos atributos são FINAL por padrão
    // Records não tem setters
    // Usar quando você sabe que a classe nao vai ser alterada e sim constante

    public String emailCaixaAlta() {
        return email.toUpperCase();
    }
}
