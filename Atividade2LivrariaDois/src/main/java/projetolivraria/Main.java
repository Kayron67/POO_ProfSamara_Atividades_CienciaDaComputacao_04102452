package projetolivraria;

public class Main {

    public static void main(String[] args) {
        Livraria livroUm = new Livraria();
        Cliente clieteUm = new Cliente();
        livroUm.setAutor("Italo");
        livroUm.setNome("Corre que tenho que chegar cedo");
        livroUm.setPreco(9.0);
        livroUm.setCategoria("Aventura / Terror");

        clieteUm.infoCliente();
        clieteUm.comprar();
    }

}