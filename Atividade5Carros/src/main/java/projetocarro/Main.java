
package projetocarro;

public class Main {

    public static void main(String[] args) {
        Carro carroUm = new Carro();

        Carro carroDois = new Carro();


        carroUm.ano = 2001;
        carroUm.marca = "Volvo"; 
        carroUm.modelo = "Corsel";
        
        carroDois.ano = 2004;
        carroDois.marca = "Mitsubichi";
        carroDois.modelo = "Nisso";


        carroUm.infoCarro();
        carroDois.infoCarro();

        
        carroUm.ligarCarro();
        carroDois.ligarCarro();
    }
}