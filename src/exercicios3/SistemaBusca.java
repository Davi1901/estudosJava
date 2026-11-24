package exercicios3;
import java.util.Scanner;

public class SistemaBusca {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean encontrado = false;
        String[] nomes = {"Davi", "Gabi", "Irene", "Fred", "Carlos"};

        System.out.print("Digite um nome: ");
        String nomeDigitado = scanner.nextLine();

        for (int i = 0; i < nomes.length; i++){
            if (nomeDigitado.equalsIgnoreCase("Davi")){
                encontrado = true;
            } else if (nomeDigitado.equalsIgnoreCase("Gabi")){
                encontrado = true;
            } else if (nomeDigitado.equalsIgnoreCase("Irene")){
                encontrado = true;
            } else if (nomeDigitado.equalsIgnoreCase("Fred")){
                encontrado = true;
            } else if (nomeDigitado.equalsIgnoreCase("Carlos")){
                encontrado = true;
            } else {
                System.out.println("Nome não encontrado");
            }
        }
        System.out.println("Nome foi achado? " + encontrado);

    }
}
