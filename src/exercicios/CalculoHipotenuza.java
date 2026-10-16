package exercicios;

import java.util.Scanner;

public class CalculoHipotenuza {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o comprimento do lado B: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        System.out.println("A hipotenuza é: " + c + "cm");

        scanner.close();
    }
}
