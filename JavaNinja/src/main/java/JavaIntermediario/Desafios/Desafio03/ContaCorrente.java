package JavaIntermediario.Desafios.Desafio03;

public class ContaCorrente extends ContaBancaria{
    TipoConta tipo = TipoConta.CORRENTE;

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    public ContaCorrente(double saldo, TipoConta tipo) {
        super(saldo);
        this.tipo = tipo;
    }

    @Override
    public void depositar(double valor) {
        saldo+= valor;
        System.out.println("Deposito realizado com sucesso, valor depositado: " + valor);
    }
}
