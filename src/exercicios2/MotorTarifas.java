package exercicios2;

public class MotorTarifas {

    static double taxaSaque = 6.50;

    public static void main(String[] args){
        sacarClienteSelect(200.00);
        sacarNaoCliente(200.00);
    }
    static void sacarClienteSelect(double valorSaque){
        double taxaSaque = 0.0;
        double valorDebitado = valorSaque + taxaSaque;
        System.out.printf("Saque Select aprovado. Total debitado: R$%.2f\n", valorDebitado);
    }

    static void sacarNaoCliente(double valorSaque){
        double valorDebitado = valorSaque + taxaSaque;
        System.out.printf("Saque Padrão aprovado. Total debitado: R$%.2f\n", valorDebitado);
    }
}
