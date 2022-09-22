package overloaded_constructors;

public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza("testo","kecap","mocarela");
        System.out.println("Evo priloga za pizzu: ");
        System.out.println(pizza.hleb);
        System.out.println(pizza.sos);
        System.out.println(pizza.kackavalj);
//        System.out.println(pizza.kulen);
    }
}
