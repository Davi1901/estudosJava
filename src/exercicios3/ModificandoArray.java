package exercicios3;





public class ModificandoArray {
    public static void main(String[] args){
        int[] valores = {5, 12, 8, 3, 20, 7};
        zerarPares(valores);

        for (int valor : valores){
            System.out.printf("%d\n", valor);
        }
    }

    static void zerarPares(int[] valores){
        for (int i = 0; i < valores.length; i++){
            if (valores[i] % 2 == 0){
                valores[i] = 0;
            }
        }
    }
}
