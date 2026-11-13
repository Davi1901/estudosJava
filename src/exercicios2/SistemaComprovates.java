package exercicios2;

public class SistemaComprovates {
    public static void main(String[] args){
        emitirComprovante("Davi", "+", 125.50);
        emitirComprovante("Messi", "-", 10.00);
        emitirComprovante("Raphinha", "*", 11.00);

    }
    static void emitirComprovante(String nomeCliente, String tipoOperacao, double valor){
        System.out.println("--- BANCO BARCELONA ---");
        System.out.printf("Cliente: %s\n", nomeCliente);
        System.out.printf("Operação: %s\n", tipoOperacao);
        System.out.printf("Valor: %.2f\n", valor);
        System.out.println("----------------------------\n");
    }
}
