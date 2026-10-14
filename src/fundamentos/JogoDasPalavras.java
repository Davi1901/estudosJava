package fundamentos;
import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class JogoDasPalavras {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String adjetivo1;
        String substantivo1;
        String adjetivo2;
        String verbo1;
        String adjetivo3;

        System.out.print("Digite um adjetivo(descrição): ");
        adjetivo1 = scanner.nextLine();
        System.out.print("Digite um substantivo(Um animal ou pessoa): ");
        substantivo1 = scanner.nextLine();
        System.out.print("Digite um adjetivo(descrição): ");
        adjetivo2 = scanner.nextLine();
        System.out.print("Digite um verbo (exemplo: dormir): ");
        verbo1 = scanner.nextLine();
        System.out.print("Digite um adjetivo(descrição): ");
        adjetivo3 = scanner.nextLine();


        System.out.println("Hoje eu fui a um: " + adjetivo1 + " zoológico");
        System.out.println("Em uma exposição, eu vi um " + substantivo1 + ".");
        System.out.println(substantivo1 + " era " + adjetivo2 + " e " + verbo1 + "!");
        System.out.println("Eu estava " + adjetivo3 + "!");

        scanner.close();




    }

}
