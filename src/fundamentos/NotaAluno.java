package fundamentos;
import java.util.Scanner;

public class NotaAluno {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua nota(de 0 a 10): ");
        double nota = scanner.nextDouble();

        if (nota < 0 || nota > 10){
            System.out.println("Nota inválida! 😡");
        } else if(nota >= 9){
            System.out.println("Excelente! Aprovado com louvor 🏆");
        } else if(nota >= 7){
            System.out.println("Aprovado! Bom trabalho 👍🏼");
        } else if(nota >= 5){
            System.out.println("Em recuperação ⚠️");
        } else {
            System.out.println("Reprovado 😡");
        }

        scanner.close();
    }
}
