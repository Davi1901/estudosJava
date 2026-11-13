package exercicios2;

public class ConversorCambio {
    public static void main(String[] args){
        double salarioMessi = converterEuroParaReal(150.00);
        System.out.printf("O valor em reais a ser transferido é: %.2f\n", salarioMessi);
        double salarioRaphinha = converterEuroParaReal(80.00);
        System.out.printf("O valor em reais a ser transferido é: %.2f", salarioRaphinha);
    }
    static double converterEuroParaReal(double valorEuro){
        double cotacao = 6.10;
        double valorM = valorEuro * cotacao;
        return valorM;
    }
}
