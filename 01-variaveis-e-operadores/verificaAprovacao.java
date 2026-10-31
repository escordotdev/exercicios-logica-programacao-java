import java.util.Scanner;

public class verificaAprovacao {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final Integer mediaParaPassar = 70;

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Olá, " + nome + " digite sua nota: ");
        Double nota = scanner.nextDouble();

        Boolean notaMaior = nota >= mediaParaPassar;

        if (notaMaior){
            System.out.print("Parabéns " + nome + ", você foi aprovado(a)!");
        }
        else {
            System.out.print("Poxa " + nome + ", infelizmente você está reprovado(a)!");
        }
        scanner.close();
    }

}
