package exercicios;
import java.util.Scanner;

public class BonusFuncionario {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quanto tempo você trabalha aqui (em anos)?");
        int anosTrabalhados = scanner.nextInt();

        System.out.print("Informe sua nota de desempenho de 0 a 10: ");
        double notaDesempenho = scanner.nextDouble();

        if (anosTrabalhados >= 5){
            if (notaDesempenho >= 8){
                System.out.println("Bônus Premium (20% do salário)");
            } else {
                System.out.println("Bônus padrão (10% do salário)");
            }
        } else {
            if (notaDesempenho >= 9){
                System.out.println("Bônus de incentivo (5% do salário) ");
            } else {
                System.out.println("Sem bônus por tempo insuficiente.");
            }
        }

        scanner.close();
    }
}
