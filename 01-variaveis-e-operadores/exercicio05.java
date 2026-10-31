import java.util.Scanner;

public class exercicio05 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Olá, " + nome + " digite sua nota: ");
        Double nota = scanner.nextDouble();

        Boolean notaMaior = nota >=70;

        if (notaMaior){
            System.out.print("Parabéns " + nome + ", você foi aprovado(a)!");
        }
        else {
            System.out.print("Poxa " + nome + ", infelizmente você está reprovado(a)!");
        }
        scanner.close();
    }

}
