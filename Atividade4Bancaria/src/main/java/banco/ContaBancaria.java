
package banco;


public class ContaBancaria {

    public String numeroConta;
    public String titular;
    public double saldo;

    public void depositar(double valor) {
        saldo = saldo + valor;
        System.out.println("Valor " + valor + " depositado");

    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo = saldo - valor;
            System.out.println("Valor do Saque: " + valor);
        }else {
            System.out.println("Erro, seu saque não foi feito");
        }
    }

    public double consultarSaldo() {
        System.out.println("Seu saldo é: " + saldo);
        return saldo;
    }
 
}
