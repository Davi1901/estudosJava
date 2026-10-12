package fundamentos;

import java.util.Scanner;

public class AprovadoOuReprovado {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite sua primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.println("Digite sua segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.println("Digite sua terceira nota: ");
        double nota3 = scanner.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7){
            System.out.println("Aprovado!");
        } else if (media >= 5){
            System.out.println("Em recuperação!");
        } else {
            System.out.println("Reprovado!");
        }
    }
}
