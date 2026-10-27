package fundamentos;
import java.util.Scanner;

public class OperadoresLogicos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //double temperatura = -10;
       // boolean estaSol = true;

        /*
        if (temperatura <= 30 && temperatura >= 0 && estaSol){
            System.out.println("O tempo está bom 😁");
            System.out.println("Está fazendo sol lá fora");
        } else if (temperatura <= 30 && temperatura >= 0 && !estaSol){
            System.out.println("O tempo está bom 😁");
            System.out.println("Está nublado lá fora ☁️");
        } else if (temperatura > 30 || temperatura < 0){
            System.out.println("A previsão do tempo é ruim 😭");
        }
    }
         */
        String name;

        System.out.print("Informe seu nome: ");
        name = scanner.nextLine();

        if (name.length() < 4 || name.length() > 12){
            System.out.println("O nome do usuário deve ter entre 4 - 12 caracteres: ");
        } else if(name.contains(" ") || name.contains("_")){
            System.out.println("O nome do usuário não pode ter espaços ou sublinhados");
        }
        else {
            System.out.println("Bem vindo " + name);
        }


        scanner.close();


    }
}