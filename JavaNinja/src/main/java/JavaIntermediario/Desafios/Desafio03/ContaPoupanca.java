package JavaIntermediario.Desafios.Desafio03;

public class ContaPoupanca extends ContaBancaria {
    TipoConta tipo = TipoConta.POUPANCA;

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    public ContaPoupanca(double saldo, TipoConta tipo) {
        super(saldo);
        this.tipo = tipo;
    }

    @Override
    public void depositar(double valor) {
        double deposito;
        deposito = valor - ((5.0 / 100) * valor);
        saldo+= deposito;
        System.out.println(deposito);
        System.out.println("Deposito realizado com sucesso, valor depositado: " + valor);
    }
}
