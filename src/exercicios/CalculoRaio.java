package exercicios;
import java.util.Scanner;

public class CalculoRaio {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o raio: ");
        double raio = scanner.nextDouble();

        double circunferencia = 2 * Math.PI * raio;
        double area = Math.PI * Math.pow(raio, 2);
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);


        System.out.printf("A circunferência é: %.1fcm\n", circunferencia);
        System.out.printf("A área é: %.1fcm²\n",  area);
        System.out.printf("O volume é: %.1fcm³\n",  volume);

        scanner.close();
    }
}
