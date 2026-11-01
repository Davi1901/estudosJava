package exercicios2;
import java.util.Scanner;

public class ContagemProgressiva {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número que vai ser o fim: (número inteiro) ");
        int fim = scanner.nextInt();

        for (int i = 1; fim >= i; i++){
            System.out.println(i);
        }
        System.out.println("Fim da contagem!");


        scanner.close();
    }
}
