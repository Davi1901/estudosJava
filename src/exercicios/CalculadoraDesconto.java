package exercicios;
import java.util.Scanner;

public class CalculadoraDesconto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a categoria do cliente: ");
        String categoria = scanner.nextLine().toLowerCase();

        switch (categoria){
            case "bronze" -> System.out.println("Desconto de: 5%");
            case "prata" -> System.out.println("Desconto de: 10%");
            case "ouro" -> System.out.println("Desconto de: 15%");
            case "diamante" -> System.out.println("Desconto de: 20%");
            default -> System.out.println("Categoria desconhecida! (sem desconto)");
        }

        scanner.close();
    }
}
