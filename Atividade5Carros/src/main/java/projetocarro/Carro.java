
package projetocarro;

public class Carro {

    public String marca;
    public String modelo;
    public int ano;

    public void infoCarro() {
        System.out.println("");
        System.out.println("Ano carro: " + getAno());
        System.out.println("Marca do carro: " + getMarca());
        System.out.println("Modelo dele: " + getModelo());
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public void ligarCarro() {
        System.out.println("");
        System.out.println("Ligando carro " + getModelo() + " da " + getMarca());
        System.out.println("Carro ligado"); 
    }
}
