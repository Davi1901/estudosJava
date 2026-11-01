package exercicios2;
import java.util.Scanner;

public class SimuladorPoupanca {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double saldoTotal = 0;
        System.out.print("Informe o valor do deposito mensal: ");
        double deposito = scanner.nextDouble();

        System.out.print("Quantos meses o dinheiro ficará guardado? ");
        int quantidadeMeses = scanner.nextInt();

        for (int i = 1; i <= quantidadeMeses; i++){
            saldoTotal += deposito;
            saldoTotal *= 1.01;
        }
        System.out.printf("O valor acumulado foi de: %.2f\n", saldoTotal);

        scanner.close();
    }
}
