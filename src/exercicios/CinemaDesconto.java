package exercicios;
import java.util.Scanner;

public class CinemaDesconto {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Você assina o clube do cinema? ");
        boolean eMembro = scanner.nextBoolean();

        System.out.print("Qual sua idade? ");
        int idade = scanner.nextInt();

        if (eMembro){
            if (idade < 18){
                System.out.println("Você tem direito a desconto de jovem membro 30% de desconto!");
            } else {
                System.out.println("Desconto padrão de membro 20%");
            }
        } else {
            if (idade < 12){
                System.out.println("Você tem direito o desconto infantil de 10% de desconto");
            } else {
                System.out.println("Valor padrão, você não tem direito a desconto nenhum!");
            }
        }


        scanner.close();

    }
}
