package exercicios;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.print("Você é um estudante? (true/false): ");
        boolean isEstudante = scanner.nextBoolean();

        //Grupo 1

        if (nome.isEmpty()){
            System.out.println("Erro! Você não digitou nada! 😡");
        } else {
            System.out.println("Olá, " + nome + " !😊");
        }

        //Grupo 2
        if (idade >= 59){
            System.out.println("Você é idoso 🧓🏼");
        } else if(idade >= 18){
            System.out.println("Você é um adulto 👨🏼‍🎓");
        } else if(idade < 0){
            System.out.println("Você não nasceu ainda 😇");
        } else if(idade == 0){
            System.out.println("Você é um bebê 🍼");
        } else {
            System.out.println("Você é uma criança 👶🏼");
        }

        //Grupo 3

        if (isEstudante){
            System.out.println("Você é um estudante! 🏫");
        } else {
            System.out.println("Você não é um estudante! 🤷‍♂️");
        }

        scanner.close();

    }
}
