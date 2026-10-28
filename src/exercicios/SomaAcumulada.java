package exercicios;
import java.util.Scanner;

public class SomaAcumulada {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        boolean continuar = true;
        int soma = 0;

        while (continuar){
            System.out.print("Digite números inteiros: ");
            numero = scanner.nextInt();

            if (numero == 0){
                continuar = false;
                System.out.println("Fim do programa!");
            } else {
                soma += numero;
            }
        }
        System.out.printf("A soma total foi: %d\n", soma);

        scanner.close();
    }
}
