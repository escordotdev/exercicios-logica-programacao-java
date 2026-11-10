import java.util.Scanner;

public class EstruturaIf {

    static void main(String[] args) {
        Double emprestimo = 4000.0;
        Double movimentacaoMedia = 1000.0;

        Boolean movimentaPeloMenosMetadeDoValor = (movimentacaoMedia * 2) >= emprestimo;
        Boolean aContaTempoSuficienteDeAbertura =true;
        Boolean temNomeLimpo = true;

        Boolean liberarEmprestimo = movimentaPeloMenosMetadeDoValor && aContaTempoSuficienteDeAbertura && temNomeLimpo;

        if ((movimentacaoMedia *2) >= emprestimo) {
            System.out.println("Sim! Crédito aprovado.");
        } else  {
            System.out.println("Não pode liberar empréstimo");
        }




    }
}
