package exercicios2;

public class ValidadorLimite {

    static double limitePadrao = 3000.00;

    public static void main(String[] args){
        validarCompraPadrao(4500.00);
        validarCompraEmergencia(4500.00);
    }

    static void validarCompraPadrao(double valorCompra){
        if (valorCompra <= limitePadrao){
            System.out.printf("Compra padrão de R$%.2f APROVADA!\n", valorCompra);
        } else {
            System.out.printf("Compra padrão de R$%.2f NEGADA!\n", valorCompra);
        }
    }

    static void validarCompraEmergencia(double valorCompra){
        double limitePadrao = 5000.00;

        if (valorCompra <= limitePadrao){
            System.out.printf("Compra emergência de R$%.2f APROVADA!\n", valorCompra);
        } else {
            System.out.printf("Compra emergência de R$%.2f NEGADA!\n", valorCompra);
        }
    }
}
