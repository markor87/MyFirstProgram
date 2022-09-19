import java.util.ArrayList;

public class two_d_array_list {
    public static void main(String[] args) {


        ArrayList<ArrayList<String>> kupovina = new ArrayList<>();

        ArrayList<String> pekara = new ArrayList<>();

        pekara.add("Hleb");
        pekara.add("Kifle");
        pekara.add("Burek");

        ArrayList<String> povrce = new ArrayList<>();

        povrce.add("Paradajz");
        povrce.add("Luk");
        povrce.add("Krompir");

        ArrayList<String> pice = new ArrayList<>();

        pice.add("Koka Kola");
        pice.add("Fanta");
        pice.add("Sprite");

        kupovina.add(pekara);
        kupovina.add(povrce);
        kupovina.add(pice);


        System.out.println(kupovina.get(2).get(2));
    }
}
