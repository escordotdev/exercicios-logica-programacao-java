import java.util.Scanner;

public class CalculadoraSimples {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        Double numero01 = scanner.nextDouble();

        System.out.println("Qual operação desejada? ");
        System.out.println("Adição = 1 ");
        System.out.println("Subtração = 2");
        System.out.println("Divisão = 3");
        System.out.println("Multiplicação = 4");
        Integer operacao = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        Double numero02 = scanner.nextDouble();

        Double resultado = null;

        if (operacao.equals(1)) {
            resultado = numero01 + numero02;
        }

        if (operacao.equals(2)) {
            resultado = numero01 - numero02;
        }

        if (operacao.equals(3)) {
            resultado = numero01 / numero02;
        }

        if (operacao.equals(4)) {
            resultado = numero01 * numero02;
        }

        System.out.println("Resultado: " + resultado);

            scanner.close();


    }
}
