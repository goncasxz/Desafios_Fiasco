package JavaIntermediario.Desafios.Desafio03;

public abstract class ContaBancaria implements Conta{
    double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("O saldo é de: R$ " + saldo);
    }

    @Override
    public abstract void depositar(double valor);
}
