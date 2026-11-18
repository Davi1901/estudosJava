package exercicios3;
import java.util.Scanner;

public class BancoJava {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        double saldo = 0;
        boolean estaRodando = true;
        int escolha;

        while (estaRodando) {
            System.out.println("-------------------");
            System.out.println("Programa bancário");
            System.out.println("-------------------");
            System.out.println("1. Mostrar Saldo: ");
            System.out.println("2. Depositar: ");
            System.out.println("3. Retirar: ");
            System.out.println("4. Sair: ");
            System.out.println("-------------------");

            System.out.print("Digite sua escolha (1-4): ");
            escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> mostrarSaldo(saldo);
                case 2 -> saldo += depositar();
                case 3 -> saldo -= retirar(saldo);
                case 4 -> estaRodando = false;
                default -> System.out.println("Escolha inválida!");
            }

        }

        System.out.println("Obrigado! Tenha um ótimo dia!");

        scanner.close();

    }
    static void mostrarSaldo(double saldo){
        System.out.println("-------------------");
        System.out.printf("Saldo atual: R$%.2f\n", saldo);
    }

    static double depositar(){
        double valor = 0;

        System.out.print("Qual valor você quer depositar: ");
        valor = scanner.nextDouble();

        if (valor < 0){
            System.out.println("Você não pode depositar valor negativo");
            return 0;
        } else {
            return valor;
        }
    }

    static double retirar(double saldo){
        double valor = 0;

        System.out.print("Qual valor você deseja retirar: ");
        valor = scanner.nextDouble();

        if (valor > saldo){
            System.out.println("Saldo insuficiente!");
            return 0;
        } else if (valor < 0){
            System.out.println("Retirada não pode ser negativa!");
            return 0;
        } else {
            return valor;
        }
    }

}
