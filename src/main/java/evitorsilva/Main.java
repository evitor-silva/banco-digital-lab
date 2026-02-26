package evitorsilva;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Cliente client1 =  new Cliente("Leandro");
       ContaCorrente leandrocc = new ContaCorrente(client1);
       leandrocc.depositar(200);
       leandrocc.imprimirExtrato();

       Cliente client2 =  new Cliente("Roger");
       ContaPoupanca rogerpp = new ContaPoupanca(client2);
       rogerpp.imprimirExtrato();


       System.out.println("Depois da transferencia");

       leandrocc.transferir(rogerpp, 10.0);
       leandrocc.imprimirExtrato();
        rogerpp.imprimirExtrato();

    }
}