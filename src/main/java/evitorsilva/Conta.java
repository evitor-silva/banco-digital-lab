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
    public Boolean sacar(double valor) {
        if (this.Saldo < valor) {
            System.out.println("Saldo insuficiente");
            return false;
        }
        this.Saldo -= valor;
        return true;
    }

    @Override
    public void transferir(Conta Conta, double valor) {
        if (this.sacar(valor))
            Conta.depositar(valor);
    }

    @Override
    public void depositar(double valor) {
        this.Saldo += valor;
    }

    protected void imprimirInfo() {
        System.out.println(String.format("Agencia: %d", this.Agencia_ID));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.Saldo));
    }
}
