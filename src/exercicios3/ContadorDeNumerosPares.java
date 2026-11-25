package exercicios3;

public class ContadorDeNumerosPares {
    public static void main(String[] args){
        int[] numeros = {12,7,4,19,8,3,10};
        System.out.printf("Quantidade encontrada: %d\n", contarPares(numeros));
    }

    static int contarPares(int[] numeros){
        int contador = 0;

        for (int numero : numeros){
            if (numero % 2 == 0){
                contador++;
            }
        }
        return contador;
    }
}
