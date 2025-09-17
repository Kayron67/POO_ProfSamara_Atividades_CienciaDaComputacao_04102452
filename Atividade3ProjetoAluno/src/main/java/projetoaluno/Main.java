
package projetoaluno;

public class Main {
    
    public static void main(String[] args) {
        Aluno AlunoUm = new Aluno();
        Aluno AlunoDois = new Aluno();

        AlunoUm.matricula = 12345;
        AlunoUm.nome = "Garli";
        AlunoUm.notaAv1 = 10.0;
        AlunoUm.notaAv2 = 9.0;

        AlunoDois.matricula = 67891;
        AlunoDois.nome = "Heitor";
        AlunoDois.notaAv1 = 2.0;
        AlunoDois.notaAv2 = 8.0;
        
        AlunoUm.dadosAluno();
        AlunoUm.calcMedia();
        AlunoUm.aprovacao();

        System.out.println("");

        AlunoDois.dadosAluno();
        AlunoDois.calcMedia();
        AlunoDois.aprovacao();
    }

}