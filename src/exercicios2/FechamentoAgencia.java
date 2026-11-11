package exercicios2;
import java.util.Scanner;

public class FechamentoAgencia {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double totalAgencia = 0;
        double valorTotal = 0;

        for (int i = 1; i <= 3; i++){
            System.out.println("--- Atendendo Cliente " + i + " ---");

            for (int j = 1; j < 3; j++){
                System.out.print("Digite o valor do depósito " + j + " :");
                totalAgencia = scanner.nextDouble();
                valorTotal += totalAgencia;
            }
        }
        System.out.printf("O total arrecado pela agência hoje foi de: R$%.2f\n", valorTotal);

        scanner.close();
    }
}
