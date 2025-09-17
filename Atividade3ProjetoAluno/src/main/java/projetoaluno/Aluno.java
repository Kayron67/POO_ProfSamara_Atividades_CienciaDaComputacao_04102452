

package projetoaluno;


public class Aluno {
    public String nome;
    public int matricula;
    public double notaAv1;
    public double notaAv2;

    public void dadosAluno() {
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota Av1: " + notaAv1);    
        System.out.println("Nota Av2: " + notaAv2);
    }

    public double calcMedia() {
        double notaFinal = (notaAv1 + notaAv2)/2;
        System.out.println("Media das notas: " + notaFinal);
        return notaFinal;
    }

    public void aprovacao() {
        if (calcMedia() >= 7) {
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovou");
        }
    }

}
