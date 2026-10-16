package exercicios;
import java.util.Scanner;

public class ReciboLoja {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.print("Quantidade comprada: ");
        int quantidade = scanner.nextInt();

        System.out.print("Preço desse produto: ");
        double preco = scanner.nextDouble();

        double total = quantidade * preco;

        System.out.printf("Você comprou %d %s e cada um custa %.2f, e o total deu: $%.2f", quantidade, nomeProduto, preco, total);

        scanner.close();
    }
}
