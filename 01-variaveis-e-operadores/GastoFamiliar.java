import java.util.Scanner;

public class GastoFamiliar {

    static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("CÁLCULO DE GASTO FAMILIAR");

        System.out.println("INSIRA SEUS GASTOS");

        Double gastoTotal = 0.0;

        System.out.print("Conta de luz: ");
        gastoTotal += scanner.nextDouble();

        System.out.print("Conta de água: ");
        gastoTotal += scanner.nextDouble();

        System.out.print("Conta de telefone: ");
        gastoTotal += scanner.nextDouble();

        System.out.print("Escola do filho: ");
        gastoTotal += scanner.nextDouble();

        System.out.print("Fatura do cartão: ");
        gastoTotal += scanner.nextDouble();

        System.out.print("Gastos com supermercado: ");
        gastoTotal += scanner.nextDouble();

        System.out.println("Seu gasto total foi de: " + gastoTotal);

        scanner.close();
    }
}
