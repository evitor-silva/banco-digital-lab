package evitorsilva;

public interface IConta {
    void sacar( double valor);
    void transferir(Conta Conta, double valor);
    void imprimirExtrato();
    void depositar(double valor);
}
