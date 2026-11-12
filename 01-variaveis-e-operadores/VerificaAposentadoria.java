import java.util.Scanner;

public class VerificaAposentadoria {

    static void main(String[] args) {

        final int IDADE_MINIMA_PARA_APOSENTAR = 55;
        final int TEMPO_MINIMO_DE_CONTRIBUICAO = 25;

        Scanner scanner = new Scanner(System.in);

        System.out.println("VERIFICAÇÃO DE APOSENTADORIA");

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Quantos anos de contribuição? ");
        int anosContribuicao = scanner.nextInt();

        Boolean limiteIdade = idade >= IDADE_MINIMA_PARA_APOSENTAR;
        Boolean tempoDeContribuição = anosContribuicao >= TEMPO_MINIMO_DE_CONTRIBUICAO;

        Boolean podeAposentar = limiteIdade && tempoDeContribuição;

        if (podeAposentar) {
            System.out.println("Você pode aposentar!");
        } else {
            System.out.println("Você não pode aposentar ainda!");
        }


        scanner.close();
    }
}
