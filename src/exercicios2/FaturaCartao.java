package exercicios2;
import java.util.Scanner;

public class FaturaCartao {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double limite = 0;
        int quantidadeCompras = 0;
        double valorCompra = 0;
        double totalFatura = 0;


        System.out.print("Informe o limite do cartão: ");
        limite = scanner.nextDouble();

        System.out.print("Quantas compras você quer fazer hoje?");
        quantidadeCompras = scanner.nextInt();

        for (int i = 1; i <= quantidadeCompras; i++){
            System.out.print("Qual o valor da compra?");
            valorCompra = scanner.nextDouble();

            if (valorCompra <= limite){
                limite -= valorCompra;
                totalFatura += valorCompra;
                System.out.println("Compra aprovada!");
            } else {
                System.out.println("Compra negada! Limite insuficiente");
            }
        }

        System.out.printf("Fatura: %.2f\n", totalFatura);
        System.out.printf("Limite: %.2f\n", limite);

        scanner.close();

    }
}
