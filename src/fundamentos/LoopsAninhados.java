package fundamentos;
import java.util.Scanner;

public class LoopsAninhados {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int linhas = 0;
        int colunas = 0;
        char simbolo;

        System.out.print("Digite a quantidade de linhas: ");
        linhas = scanner.nextInt();

        System.out.print("Digite a quantidade de colunas: ");
        colunas = scanner.nextInt();

        System.out.print("Digite o símbolo para usar: ");
        simbolo = scanner.next().charAt(0);

        for (int i = 0; i < linhas; i++){
            for (int j = 0; j < colunas; j++){
                System.out.print(simbolo);
            }
            System.out.println();
        }



        scanner.close();
    }
}
