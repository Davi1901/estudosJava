package exercicios2;
import java.util.Scanner;

public class MonitoramentoPix {
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in);

        System.out.print("Quantas transferências você fez hoje: ");
        int quantidadePix = scanner.nextInt();
        double valorPix = 0;
        int quantidadeAltasPix = 0;
        double somaTotal = 0;

        for (int i = 1; i <= quantidadePix; i++){
            System.out.print("Qual valor do pix realizado: ");
            valorPix = scanner.nextDouble();
            somaTotal += valorPix;

            if (valorPix > 500){
                System.out.println("Transação de alto valor!");
                quantidadeAltasPix++;
            } else {
                System.out.println("Valor padrão.");
            }

        }
        System.out.printf("O valor total movimentado: %.2f\n", somaTotal);
        System.out.printf("Quantidade de pix com alto valor: %d\n", quantidadeAltasPix);

       scanner.close();
    }
}
