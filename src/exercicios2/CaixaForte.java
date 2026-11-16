package exercicios2;

public class CaixaForte {
    static double reservaFisica = 50000.00;
    public static void main(String[] args){
        System.out.printf("1. Reserva inicial: R$%.2f\n", reservaFisica);
        solicitarSaque(15000.00);
        System.out.printf("2. Reserva após simulção: R$%.2f\n", reservaFisica);
        solicitarSaque(15000.00, "GER-9090");
        System.out.printf("3. Reserva Final: R$%.2f", reservaFisica);
    }
    static void solicitarSaque(double valor){
        double reservaFisica = 50000.00;
        reservaFisica = reservaFisica - valor;
        System.out.printf("Simulação: Saque de R$%.2f viável. Reserva projetada: R$%.2f\n", valor, reservaFisica);
    }

    static void solicitarSaque(double valor, String token){
        reservaFisica = reservaFisica - valor;
        System.out.printf("Saque oficial autorizado via token %s. Reserva atualizada: R$%.2f\n", token, reservaFisica);
    }
}
