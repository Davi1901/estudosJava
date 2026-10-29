package exercicios2;
import java.util.Scanner;

public class MediaNotas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double nota = 0;
        boolean continuar = true;
        double soma = 0;
        int quantidadeNotas = 0;

        while(continuar){
            System.out.println("Digite sua nota (notas positivas): ");
            System.out.println("Digite um número negativo para sair (-1): ");
            nota = scanner.nextDouble();

            if (nota < 0){
                continuar = false;
                System.out.println("Fim do programa!");
            } else {
                soma += nota;
                quantidadeNotas++;
            }
        }
        if (quantidadeNotas > 0){
            double media = soma / quantidadeNotas;
            System.out.printf("Quantidade de notas: %d \n",quantidadeNotas);
            System.out.printf("A soma total das notas é: %.2f\n", soma);
            System.out.printf("A sua média é: %.2f", media);
        } else {
            System.out.println("Quantidade não pode ser zero!");
        }
        scanner.close();
    }
}
