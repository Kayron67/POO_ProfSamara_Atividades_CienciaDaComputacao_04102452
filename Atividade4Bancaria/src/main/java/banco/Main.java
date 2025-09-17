package banco;

public class Main {

    public static void main(String[] args) {
        ContaBancaria ContaUm = new ContaBancaria();
        ContaBancaria ContaDois = new ContaBancaria();

        ContaUm.numeroConta = "1234";
        ContaUm.saldo = 1000.00;
        ContaUm.titular = "Italo";

        ContaDois.numeroConta = "5678";
        ContaDois.saldo = 2100980.51;
        ContaDois.titular = "Bling Bling Boy";

        ContaDois.consultarSaldo();
        ContaUm.depositar(300);
        ContaUm.sacar(1300);
        ContaUm.consultarSaldo();
        
        System.out.println("");

        ContaDois.consultarSaldo();
        ContaDois.depositar(1000.001);
        ContaDois.sacar(20.50);
        ContaDois.consultarSaldo();


    }
}