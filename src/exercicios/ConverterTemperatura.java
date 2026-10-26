package exercicios;
import java.util.Scanner;

public class ConverterTemperatura {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double temperatura;
        double novaTemperatura;
        String unidade;

        System.out.print("Digite a temperatura: ");
        temperatura = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Converter para Celsius ou Fahrenheit? (C ou F): ");
        unidade = scanner.nextLine();
        unidade = unidade.toUpperCase();

        novaTemperatura = (unidade.equals("C")) ? (temperatura - 32) * 5 / 9 : (temperatura * 9 / 5) + 32;

        System.out.printf("%.1fº%s\n", novaTemperatura, unidade);

        scanner.close();
    }
}
