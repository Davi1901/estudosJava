package exercicios;
import java.util.Scanner;

public class AprovadorAluno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a sua nota: ");
        double nota = scanner.nextDouble();

        String status = (nota >= 6) ? "Aprovado" : "Reprovado";

        System.out.printf("Você está %s\n", status);

        scanner.close();
    }
}
