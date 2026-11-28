package exercicios3;
import java.util.Scanner;

public class ListaComprasDinamica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int qtdItens;

        System.out.print("Quantos itens você quer: ");
        qtdItens = scanner.nextInt();
        scanner.nextLine();

        String[] compras = new String[qtdItens];

        for (int i = 0; i < qtdItens; i++){
            System.out.print("Digite o " + (i + 1) + "º item: ");
            compras[i] = scanner.nextLine();
        }
        scanner.close();

        System.out.println("Compras: ");
        for (String compra : compras){
            System.out.println(compra);
        }
    }
}
