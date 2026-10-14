package fundamentos;
import java.util.Scanner;

public class carrinhoCompras {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        char moeda = '$';

        System.out.print("Qual item você gostaria de comprar? ");
        String produto = scanner.nextLine();

        System.out.print("Qual preço de cada um? ");
        double preco = scanner.nextDouble();

        System.out.print("Quantos você quer comprar? ");
        int quantidade = scanner.nextInt();

        System.out.println("Você comprou " + quantidade + " " + produto + "/s");

        System.out.println("Seu total ficou: " + moeda + quantidade * preco);

        scanner.close();

    }
}
