package fundamentos;

public class MetodosExercicios {
    public static void main(String[] args){
        double result = cubo(3);
        System.out.printf("Resultado final %.2f\n", result);
        String nomeResult = nomeCompleto("Davi", "Bitencourt");
        System.out.printf("Seu nome é: %s\n", nomeResult);

        boolean idadeCheck = idadeChecada(16);
        if (idadeCheck){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Você é menor de idade");
        }

    }
        static double square(double number){
            return number * number;
        }
        static double cubo(double number){
            return number * number * number;
        }
        static String nomeCompleto(String nome, String sobrenome){
            return nome + " " + sobrenome;
        }
        static boolean idadeChecada(int idade){
            if (idade >= 18){
                return true;
            } else {
                return false;
            }
        }

}
