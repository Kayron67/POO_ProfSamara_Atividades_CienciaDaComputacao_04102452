

package projetolivraria;


public class Livraria {
    public String nome;
    public String autor;
    public String categoria;
    public double preco;

    public void setNome(String nome) {
        this.nome = nome;
        System.out.println("Nome: " + this.nome);
    }

    public void setAutor(String autor) {
        this.autor = autor;
        System.out.println("Autor: " + this.autor);
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
        System.out.println("Categori: " + this.categoria);
    }

    public void setPreco(double preco) {
        this.preco = preco;
        System.out.println("Preço: " + this.preco);
    }
    
    


}
