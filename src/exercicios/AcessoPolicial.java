package exercicios;
import java.util.Scanner;

public class AcessoPolicial {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe seu cargo: ");
        String cargo = scanner.nextLine();

        if (cargo.equalsIgnoreCase("Dexter")){
            System.out.println("Acesso total à sala de análise de sangue 🩸🔪");
        } else if (cargo.equalsIgnoreCase("Debra")){
            System.out.println("Acesso à delegacia, mas longe das evidências 👮🏼‍♀️");
        } else if (cargo.equalsIgnoreCase("Batista")){
            System.out.println("Acesso à delegacia e as evidências 🕵");
        } else {
            System.out.println("Acesso NEGADO! Intruso detectado ☢️");
        }
    }
}
