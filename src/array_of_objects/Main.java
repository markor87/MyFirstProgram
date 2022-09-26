package array_of_objects;

public class Main {
    public static void main(String[] args) {
//        int[] brojevi = new int[3];
//        char[] karakteri = new char[4];
//        String[] stringovi = new String[5];

//        Hrana[] frizider = new Hrana[3];

        Hrana hrana1 = new Hrana("Pizza");
        Hrana hrana2 = new Hrana("Pljeka");
        Hrana hrana3 = new Hrana("Belo");
        Hrana sok1 = new Hrana(5);

        Hrana[] frizider = {hrana1, hrana2, hrana3,sok1};

        frizider[0] = hrana1;
        frizider[1] = hrana2;
        frizider[2] = hrana3;

        System.out.println(frizider[0].ime);
        System.out.println(frizider[1].ime);
        System.out.println(frizider[2].ime);
        System.out.println(frizider[3].broj);
    }
}
