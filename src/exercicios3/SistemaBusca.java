package exercicios3;
import java.util.Scanner;

public class SistemaBusca {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false;
        String[] nomes = {"Davi", "Gabi", "Irene", "Fred", "Carlos"};

        System.out.print("Digite um nome: ");
        String nomeDigitado = scanner.nextLine();

        scanner.close();

        for (int i = 0; i < nomes.length; i++){
            if (nomeDigitado.equalsIgnoreCase(nomes[i])){
                System.out.printf("Nome encontrado na posição: %d\n", i);
                encontrado = true;
                break;
            }
        }

        if (!encontrado){
            System.out.println("Nome não encontrado!");
        }


    }
}
