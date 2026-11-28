package exercicios3;
import java.util.Scanner;

public class ListaComprasDinamica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int qtdItens;

        System.out.print("Quantos itens você quer: ");
        qtdItens = scanner.nextInt();
        scanner.nextLine();

        if (qtdItens <= 0){
            System.out.println("Erro! A quantidade não pode ser menor que 1.");
        } else {
            String[] compras = new String[qtdItens];


            for (int i = 0; i < qtdItens; i++){
                System.out.print("Digite o " + (i + 1) + "º item: ");
                compras[i] = scanner.nextLine();
            }


            System.out.println("Compras: ");
            for (String compra : compras){
                System.out.println(compra);
            }
        }
        scanner.close();

    }
}
