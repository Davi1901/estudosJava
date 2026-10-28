package fundamentos;
import java.util.Scanner;

public class whileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String name = "";

        while(name.isEmpty()){
            System.out.print("Digite seu nome: ");
            name = scanner.nextLine();
        }

        System.out.println("Olá " + name);

        scanner.close();
    }
}
