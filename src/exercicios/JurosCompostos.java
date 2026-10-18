package exercicios;
import java.util.Scanner;

public class JurosCompostos {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        double principal;
        double juros;
        int timesCompounded;
        int anos;
        double amount;

        System.out.print("Digite o valor de entrada(principal): ");
        principal = scanner.nextDouble();

        System.out.print("Digite o valor do juros: ");
        juros = scanner.nextDouble() / 100;

        System.out.print("Digite o número de vezes que é capitalizado por ano: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Digite o número de anos: ");
        anos = scanner.nextInt();

        amount = principal * Math.pow(1 + juros / timesCompounded, timesCompounded * anos);

        System.out.printf("O valo após %d é: $%.2f ", anos, amount);







        scanner.close();
    }
}
