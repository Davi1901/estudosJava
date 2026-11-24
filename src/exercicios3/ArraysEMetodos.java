package exercicios3;

public class ArraysEMetodos {
    public static void main(String[] args){
        double[] notas = {7.5, 9.0, 6.2, 8.8};

        System.out.printf("Média: %.1f\n", calcularMedia(notas));
        System.out.printf("A maior nota é: %.1f\n", maiorValor(notas));
    }

    static double calcularMedia(double[] notas){
        double total = 0;
        double media = 0;
        for (int i = 0; i < notas.length; i++){
            total += notas[i];
        }
        media = total / notas.length;

        return media;
    }
    static double maiorValor(double[] notas){
        double maior = notas[0];

        for (int i = 0; i < notas.length; i++){
            if (notas[i] > maior){
                maior = notas[i];
            }
        }
        return maior;
    }
}
