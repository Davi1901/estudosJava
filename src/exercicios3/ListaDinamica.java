package exercicios3;
import java.util.Arrays;
import java.util.Scanner;

public class ListaDinamica {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] series = new String[4];

        System.out.printf("Digite suas 4 séries favoritas\n");
        for (int i = 0; i < series.length; i++){
            System.out.printf("Digite a %dª série: ", i + 1);
            series[i] = scanner.nextLine();
        }
        scanner.close();
        Arrays.sort(series);

        System.out.println("Suas séries em ordem alfabética");
        for (String serie : series){
            System.out.println(serie);
        }
    }
}
