package fundamentos;

public class overloadedExemplo {
    public static void main(String[] args){
        String pizza = bakePizza("pão sírio", "mussarela", "presunto");
        System.out.println(pizza);
    }
    static String bakePizza(String pao){
        return pao + " pizza";
    }
    static String bakePizza(String pao, String queijo){
        return queijo + " " + pao + " pizza";
    }
    static String bakePizza(String pao, String queijo, String recheio){
        return recheio + " " + queijo + " " + pao + " pizza";
    }

}
