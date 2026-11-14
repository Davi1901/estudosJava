package exercicios2;

public class CalculadoraVendas {
    public static void main(String[] args){

       double venda1 = calcularPrecoFinal(20.00, 5);
       double venda2 = calcularPrecoFinal(25.00, 12);

        System.out.printf("Total da venda 1: R$%.2f\n", venda1);
        System.out.printf("Total da venda 2: R$%.2f\n", venda2);
    }
    static double calcularPrecoFinal(double precoMetro, double quantidadeMetro){
        double valorTotal = precoMetro * quantidadeMetro;

        if (quantidadeMetro >= 10){
            valorTotal = valorTotal - (valorTotal * 0.10);
        }
        return  valorTotal;
    }
}
