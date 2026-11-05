import java.util.Scanner;

public class DescontoEmFrete {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double frete = 15.00;
        Double valorFinal;

        System.out.print("Digite o valor do produto: R$ ");
        Double valorProduto = scanner.nextDouble();

        if (valorProduto >= 100.00){
            valorFinal = valorProduto;                          // frete grátis
        }
        else {
            valorFinal = valorProduto + frete;                  // soma o frete
        }

        System.out.println("Valor final da compra: R$ " + valorFinal);




        scanner.close();
    }
}
