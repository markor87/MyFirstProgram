import java.util.ArrayList;

public class for_each {
    public static void main(String[] args) {

//        String[] zivotinje = {"macka", "pas", "ptica"};

        ArrayList<String> zivotinje = new ArrayList<>();

        zivotinje.add("macka");
        zivotinje.add("pas");
        zivotinje.add("ptica");

        for (String i : zivotinje) {
            System.out.println(i);
        }
    }
}
