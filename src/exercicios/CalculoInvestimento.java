package exercicios;
import java.util.Scanner;

public class CalculoInvestimento {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o capital inicial: ");
        double capital = scanner.nextDouble();

        System.out.print("Digite a taxa de juros mensal: ");
        double juros = scanner.nextDouble();

        System.out.print("Digite a quantidade de meses: ");
        int meses = scanner.nextInt();

        juros /= 100;
        double montante = capital * Math.pow((1 + juros), meses);

        System.out.printf("Valor final do investimento: R$ %.2f\n", montante);

        scanner.close();
    }
}
