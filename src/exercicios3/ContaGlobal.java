package exercicios3;

import java.util.Scanner;

public class ContaGlobal {
    static Scanner scanner = new Scanner(System.in);
    static double cotacaoDolar = 5.50;
    public static void main(String[] args){
        double saldoReais = 5000.00;
        double saldoDolares = 0.0;
        boolean estaRodando = true;

        while (estaRodando){
            System.out.println("[1] Ver Saldos (BRL e USD)");
            System.out.println("[2] Comprar dólar (BRL -> USD");
            System.out.println("[3] Vender dólar (USD -> BRL");
            System.out.println("[4] Sair");

            System.out.print("O que você deseja fazer: ");
            int escolha = scanner.nextInt();

            switch (escolha){
                case 1 -> mostrarSaldos(saldoReais, saldoDolares);
                case 2 -> {
                    double dolarComprado = comprarDolar(saldoReais);
                    saldoDolares += dolarComprado;
                    saldoReais -= (dolarComprado * cotacaoDolar);
                }
                case 3 -> {
                    double vendaDolar = venderDolar(saldoDolares);
                    saldoDolares -= vendaDolar;
                    saldoReais += (vendaDolar * cotacaoDolar);

                }
                case 4 -> estaRodando = false;
                default -> System.out.println("Opção inválida!");
            }
        }
        scanner.close();
    }

    static void mostrarSaldos(double reais, double dolares){
        System.out.printf("Reais: R$%.2f | Dolares: US$%.2f\n", reais, dolares);
    }

    static double comprarDolar(double saldoReais){
        System.out.print("Quantos dólares você quer comprar: ");
        double valorDolar = scanner.nextDouble();
        double custoReal =  valorDolar * cotacaoDolar;
        if (valorDolar <= 0 || custoReal > saldoReais){
            System.out.println("Compra negada!");
            return 0;
        } else {
            System.out.println("Compra aprovada");
            return valorDolar;
        }

    }

    static double venderDolar(double saldoDolares){
        System.out.print("Quantos dólares você quer vender: ");
        double valorVenda = scanner.nextDouble();
        if (valorVenda <= 0 || valorVenda > saldoDolares){
            System.out.println("Operação negada!");
            return 0;
        } else {
            return valorVenda;
        }
    }
}
