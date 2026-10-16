package exercicios;
import java.util.Scanner;

public class FichaPerfil {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite sua altura (metros): ");
        double altura = scanner.nextDouble();

        System.out.print("Você gosta de programar? (true ou false): ");
        boolean gostaProgramar = scanner.nextBoolean();

        System.out.printf("Seu nome é : %s\n", nome);
        System.out.printf("Sua idade é: %d\n", idade);
        System.out.printf("Sua altura é: %.2f\n", altura);
        System.out.printf("Você gosta de programar? %b\n", gostaProgramar);

        System.out.printf("%s tem %d anos de idade, e a sua altura é: %.2f\n", nome, idade, altura);

        scanner.close();
    }
}
