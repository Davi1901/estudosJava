package fundamentos;
import java.util.Scanner;

public class EntradaCliente {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);


        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        scanner.nextLine(); // limpando o buffer.

        System.out.println("Digite sua cor favorita: ");
        String cor = scanner.nextLine();

        System.out.println("Você tem " + idade + " anos");
        System.out.println("Você gosta da cor: " + cor);

        /*
        System.out.print("Qual seu nome? ");
        String nome = scanner.nextLine();

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        System.out.print("Qual seu peso? ");
        double peso = scanner.nextDouble();

        System.out.print("Você é um estudante? (verdadeiro/falso): ");
        boolean isEstudante = scanner.nextBoolean();

        System.out.println("Muito prazer, " + nome);
        System.out.println("Você tem " + idade + " anos");
        System.out.println("Você está pesando: " + peso + "kg");

        if (isEstudante){
            System.out.println("Você está matriculado!");
        } else {
            System.out.println("Você não é um aluno da escola");
        }


        scanner.close();


         */
    }
}
