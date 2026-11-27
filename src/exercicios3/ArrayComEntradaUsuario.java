package exercicios3;
import java.util.Scanner;

public class ArrayComEntradaUsuario {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String[] comidas;
        int qtaFrutas = 0;

        System.out.print("Quantas frutas vão ter: ");
        qtaFrutas = scanner.nextInt();
        scanner.nextLine();

        comidas = new String[qtaFrutas];


        for (int i = 0; i < qtaFrutas; i++){
            System.out.print("Digite uma fruta: ");
            comidas[i] = scanner.nextLine();

        }

        for (String comida : comidas){
            System.out.println(comida);
        }

        scanner.close();
    }
}
