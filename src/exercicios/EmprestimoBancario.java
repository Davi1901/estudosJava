package exercicios;
import java.util.Scanner;

public class EmprestimoBancario {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Digite seu salário: ");
        double salario = scanner.nextDouble();

        if (idade >= 18){
            if (salario >= 3000.0){
                System.out.println("Empréstimo aprovado!");
            } else {
                System.out.println("Você tem algum fiado/garantia? ");
                boolean temGarantia = scanner.nextBoolean();

                if (temGarantia){
                    System.out.println("Empréstimo aprovado!");
                } else {
                    System.out.println("Empréstimo não aprovado!");
                }
            }
        } else {
            System.out.println("Empréstimo negado, você é menor de idade!");
        }

        scanner.close();
    }
}
