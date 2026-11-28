package exercicios3;
import java.util.Scanner;

public class ControleGastosDinamico {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int qtdProdutos;
        boolean estaRodando = true;
        double soma = 0;

        while(estaRodando){
            System.out.print("Quantos produtos você quer registrar hoje: ");
            qtdProdutos = scanner.nextInt();
            scanner.nextLine();

            if (qtdProdutos <= 0){
                System.out.println("Erro! A quantidade não pode ser menor ou igual a 0.");
            } else {
                estaRodando = false;
                double[] gastos = new double[qtdProdutos];

                for (int i = 0; i < qtdProdutos; i++){
                    System.out.print("Digite o valor do " + (i + 1) + "º produto: ");
                    gastos[i] = scanner.nextDouble();
                }

                for (double gasto : gastos){
                    soma += gasto;
                }
                System.out.printf("Total gasto: R$%.2f\n", soma);
                System.out.printf("A média dos gastos foi: R$%.2f\n", (soma / qtdProdutos));


            }


        }
            scanner.close();
    }
}
