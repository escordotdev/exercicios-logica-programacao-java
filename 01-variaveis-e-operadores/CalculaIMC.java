import java.util.Scanner;

public class CalculaIMC {
    static void main() {   // fazer uma calc de IMC
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA DE IMC");

        System.out.print("Digite seu peso em kg: ");
        Double peso = scanner.nextDouble();

        System.out.print("Digite sua altura em metros: ");
        Double altura = scanner.nextDouble();

        Double imc = peso / (altura * altura);

        System.out.println("Seu IMC é: " + imc );



        scanner.close();
    }
}
