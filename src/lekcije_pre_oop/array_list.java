package lekcije_pre_oop;

import java.util.ArrayList;

public class array_list {
    public static void main(String[] args) {
        ArrayList<String> hrana = new ArrayList<>();
        int i;

        hrana.add("Gurmanska pljeskavica");
        hrana.add("Punjena pljeskavica");
        hrana.add("Rolovana pljeskavica");

        hrana.set(2, "Pilece belo");

        hrana.remove(1);

//        hrana.clear();

        for (i = 0; i < hrana.size(); i++) {
            System.out.println(hrana.get(i));
        }

    }
}
