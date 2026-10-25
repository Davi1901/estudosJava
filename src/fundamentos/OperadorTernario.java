package fundamentos;

public class OperadorTernario {
    public static void main(String[] argsg){
        int idade = 15;
        int num = 3;

        String verficarIdade = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        String parOuImpar = (num % 2 == 0) ? "Par" : "Ímpar";
        System.out.println(parOuImpar);
    }
}
