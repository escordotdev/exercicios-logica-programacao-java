import java.util.Scanner;

public class CalculaValorComDesconto {

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite valor do produto: ");
        Double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade de produtos: ");
        Integer quantidade = scanner.nextInt();

        Double subtotal = valorProduto * quantidade;

        Boolean maiorQueDez = quantidade >= 10;

        Double percentual = 0.0;

        if (maiorQueDez){
            percentual = 10.0;
        }

        Double desconto = subtotal * percentual / 100;

        Double valorComDesconto = subtotal - desconto;

        System.out.println("Valor Total: " + valorComDesconto);

        scanner.close();
    }
}
