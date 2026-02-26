package evitorsilva;

public abstract class Conta implements IConta {

    protected Cliente cliente;
    protected int Agencia_ID = 1;
    protected int numero = 1;
    protected double Saldo = 0;

    public Conta(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.Saldo -= valor;
    }

    @Override
    public void transferir(Conta Conta, double valor) {
        this.sacar(valor);
        Conta.depositar(valor);
    }

    @Override
    public void depositar(double valor){
        this.Saldo += valor;
    }

    protected void imprimirInfo() {
        System.out.println(String.format("Agencia: %d", this.Agencia_ID));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.Saldo));
    }
}
