package JavaIntermediario.Desafios.Desafio03;

public class Main {
    public static void main(String[] args) {
        /*Objeto 1*/
        ContaCorrente conta1 = new ContaCorrente(1500, TipoConta.CORRENTE);
        conta1.consultarSaldo();
        conta1.depositar(103.5);
        conta1.consultarSaldo();

        /*Objeto 2*/
        ContaPoupanca conta2 = new ContaPoupanca(1000, TipoConta.POUPANCA);
        conta2.consultarSaldo();
        conta2.depositar(100.0);
        conta2.consultarSaldo();
    }
}
