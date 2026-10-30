import java.util.Scanner;

public class exercicio03 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        // Leia um número no console e depois faça o cálculo do quadrado desse número
        System.out.println("CALCULANDO O QUADRADO DE UM NÚMERO");

        System.out.print("Digite um número: ");
        Integer numero = scanner.nextInt();

        Integer quadrado = numero * numero;

        System.out.println("O quadrado de " + numero + " é " + quadrado + ".");

        scanner.close();
    }
}
