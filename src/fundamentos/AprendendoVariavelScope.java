package fundamentos;

public class AprendendoVariavelScope {

    static int x = 3;


    public static void main(String[] args){

        int x = 1;

        System.out.println(x);

        facaAlgo();
    }

    static void facaAlgo(){

        int x = 2;

        System.out.println(x);
    }
}
