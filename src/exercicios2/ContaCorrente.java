package exercicios2;

public class ContaCorrente {

    static double saldoGlobal = 1000.00;

    public static void main(String[] args){
        System.out.printf("1. Saldo inicial: R$%.2f\n", saldoGlobal);
        simularPix(200.00);
        System.out.printf("2. Saldo após a simulação: R$%.2f\n", saldoGlobal);
        confirmarPix(200.00);
        System.out.printf("3. Saldo Final: R$%.2f\n", saldoGlobal);
    }
    static void simularPix(double valorPix){
        double saldoGlobal = 1000.00;
        saldoGlobal = saldoGlobal - valorPix;
        System.out.printf("Simulação PIX concluída. Saldo projetado: R$%.2f\n", saldoGlobal);
    }
    static void confirmarPix(double valorPix){
        saldoGlobal = saldoGlobal - valorPix;
        System.out.printf("PIX Oficial realizado. Saldo atualizado: R$%.2f\n", saldoGlobal);
    }
}
