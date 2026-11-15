package exercicios2;

public class MotorTransferencia {
    public static void main(String[] args){
        realizarTransferencia("433.936.458-46", 1500.00);
        realizarTransferencia("Santader", "11977306162", 250.50);
        realizarTransferencia("433.936.458-46", 500.00, "Parabéns pelo seu esforço, continue assim!");
    }
    static void realizarTransferencia(String chavePix, double valor){
        System.out.println("Transferência PIX de R$ " + valor + " enviada para a chave: " + chavePix);
    }
    static void realizarTransferencia(String agencia, String numeroConta, double valor){
        System.out.println("Transferência TED de R$ " + valor + " enviada para a Agência " + agencia + " , conta " + numeroConta);
    }
    static void realizarTransferencia(String chavePix, double valor, String mensagem){
        System.out.println("Transferência PIX de R$ " + valor + " enviada para a chave: " + chavePix + ". Mensagem: " + mensagem);
    }
}
