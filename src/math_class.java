import java.util.Scanner;
public class math_class {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        Scanner scanner = new Scanner(System.in);

        //String ime = scanner.nextLine();
        System.out.println("Unesite duzinu prve stranice.");
        x = scanner.nextDouble();

        System.out.println("Unesite druge stranice.");
        y=scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("Hipotenuza je " + z);

    }
}
