package exercicios;
import java.util.Scanner;

public class TabuadaInterativa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;
        int numero = 0;
        int contagem = 1;

        while(continuar){
            System.out.print("Digite um número para ver a tabuada (ou -1 para sair): ");
            numero = scanner.nextInt();

            if (numero < 0){
                continuar = false;
                System.out.println("Fim do programa.");
            } else {
                for (int i = 1; i <= 10; i++){
                    int resultado = numero * i;
                    System.out.println(numero + " X " + i + " = " + resultado);

                }
            }

    }
        scanner.close();
}
}
