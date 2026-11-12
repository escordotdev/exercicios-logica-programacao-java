import java.util.Scanner;

public class QualNumeroMaior {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int primeiroNumero = scanner.nextInt();

        System.out.println("Digite outro inteiro: ");
        int segundoNumero = scanner.nextInt();

        System.out.println("Digite outro número inteiro: ");
        int terceiroNumero = scanner.nextInt();

        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
            System.out.println("O número " + primeiroNumero + " é o maior.");
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
            System.out.println("O número " + segundoNumero + " é o maior.");
        } else {
            System.out.println("O número " + terceiroNumero + " é o maior.");
        }


        scanner.close();

    }
}
