package exercicios2;

public class ConversorMoedas {

    static double cotacaoDolar = 5.80;

    public static void main(String[] args){
        converterCotaPadrao(5800.00);
        converterCotaVip(5800.00, 5.00);
    }

    static void converterCotaPadrao(double valorReais){
        double valorDolar = valorReais / cotacaoDolar;
        System.out.printf("Conversão padrão: USD%.2f\n", valorDolar);
    }

    static void converterCotaVip(double valorReais, double cotacaoDolar){
        double valorDolar = valorReais / cotacaoDolar;
        System.out.printf("Conversão VIP: USD%.2f\n", valorDolar);
    }
}
