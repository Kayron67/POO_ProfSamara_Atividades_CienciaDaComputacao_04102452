package projetolivraria;

public class Cliente {
    public String nome;
    public double id;
    public double Saldo;

    public void infoCliente() {
        System.out.println("Nome: " + nome);
        System.out.println("id: " + id);
        System.out.println("Saldo: " + Saldo);
    }

    public void comprar() {
        System.out.println("Livro comprado");
    }


}
