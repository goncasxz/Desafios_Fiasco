package JavaIntermediario.Aula09;

public class Main {
    public static void main(String[] args) {


        Ninja cadastro = new Ninja("Naruto", "naruto@email.com", 99999999);
        System.out.println("Cadastro sem record = " + cadastro);

        NinjaRecord cadastroUsandoRecord = new NinjaRecord("Sasuke", "sasuke@gmail.com", 1111111);
        System.out.println("Cadastro Usando Record = " + cadastroUsandoRecord);
        System.out.println("Email com metodo criado no records = " + cadastroUsandoRecord.emailCaixaAlta());
    }
}
