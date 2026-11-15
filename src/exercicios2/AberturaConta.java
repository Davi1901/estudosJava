package exercicios2;

public class AberturaConta {
    public static void main(String[] args){
        criarConta("433.936.458-46");
        criarConta("433.936.458-46", 150.00);
        criarConta("433.936.458-46", 250.00, "1901-1901");
    }
    static void criarConta(String cpf){
        System.out.println("Conta básica criada. CPF: " + cpf);
    }
    static void criarConta(String cpf, double depositoIni){
        System.out.println("Conta padrão criada. CPF: " + cpf + " | Saldo inicial: R$" + depositoIni);
    }
    static void criarConta(String cpf, double depositoIni, String convite){
        System.out.println("Conta VIP criada! CPF: " + cpf + " | Saldo inicial: R$" + depositoIni + " | Convite VIP: " + convite);
    }
}
