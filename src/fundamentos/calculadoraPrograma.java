package fundamentos;
import java.util.Scanner;

public class calculadoraPrograma {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double numero1;
        double numero2;
        char operador;
        double result = 0;
        boolean validarOperacao = true;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();

        System.out.print("Escolha uma operação: (+, -, /, *, ^) ");
        operador = scanner.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        switch (operador){
            case '+' -> result = numero1 + numero2;
            case '-' -> result = numero1 - numero2;
            case '*' -> result = numero1 * numero2;
            case '/' -> {
                if (numero2 == 0){
                    System.out.println("Não dá para divirdir com zero!");
                    validarOperacao = false;
                } else {
                    result = numero1 / numero2;
                }
            }
            case '^' -> result = Math.pow(numero1, numero2);
            default -> {
                System.out.println("Operador inválido");
                validarOperacao = false;
            }
        }

        if (validarOperacao){
            System.out.println(result);
        }
        scanner.close();
    }
}
