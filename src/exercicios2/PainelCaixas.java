package exercicios2;
import java.util.Scanner;

public class PainelCaixas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int qtdAgencias = 0;
        int qtdCaixas = 0;

        System.out.print("Quantas agências o banco possui hoje?");
        qtdAgencias = scanner.nextInt();

        System.out.print("Quantos caixas eletrônicos existem em cada agência? ");
        qtdCaixas = scanner.nextInt();

        for (int i = 1; i <= qtdAgencias; i++){
            System.out.print("Agência " + i + ": ");

            for (int j = 1; j <= qtdCaixas; j++){
                System.out.print("[CX " + j + "] ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
