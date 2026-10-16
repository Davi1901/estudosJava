package exercicios;
import java.util.Scanner;

public class CalculoImc {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura: ");
        double altura = scanner.nextDouble();

        double imc = (peso / Math.pow(altura, 2));

        System.out.printf("O seu imc é igual a: %.2f\n", imc);

        scanner.close();
    }
}
