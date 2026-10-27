package exercicios;
import java.util.Scanner;

public class CalculadoraArea {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double raioCirculo;
        double baseTriangulo;
        double alturaTriangulo;
        double ladoQuadrado;
        String formas;
        double result = 0;
        boolean verificacao = true;
        String resultQ = "";
        String resultC = "";
        String resultT = "";

        System.out.print("Digite a forma geométrica (Q, C, T): ");
        formas = scanner.nextLine().toUpperCase();

        switch (formas){
            case "Q" -> {
                    System.out.print("Digite o valor dos lados: ");
                    ladoQuadrado = scanner.nextDouble();
                    result = ladoQuadrado * ladoQuadrado;
                    resultQ = "A área do quadrado é " + result;
            }

            case "C" -> {
                System.out.print("Digite o raio do círculo: ");
                raioCirculo = scanner.nextDouble();
                result = Math.PI * Math.pow(raioCirculo, 2);
                resultC = "A área do círculo é: " + result;
            }

            case "T" -> {
                System.out.print("Digite a base do triângulo: ");
                baseTriangulo = scanner.nextDouble();
                System.out.print("Digite a altura do triângulo: ");
                alturaTriangulo = scanner.nextDouble();
                result = (baseTriangulo * alturaTriangulo) / 2;
                resultT = "A área do triângulo é: " + result;
            }

            default -> {
                System.out.println("Erro! Você digitou letras inválidas.");
                verificacao = false;
            }

        }
        if (verificacao){
            if (!resultQ.isEmpty()){
                System.out.println(resultQ);
            }

            if (!resultC.isEmpty()){
                System.out.println(resultC);
            }

            if (!resultT.isEmpty()){
                System.out.println(resultT);
            }
        }


        scanner.close();
    }
}
