import java.util.Scanner;
import javax.swing.JOptionPane;
public class math_class {
    public static void main(String[] args) {
        double x;
        double y;
        double z;
        /*Scanner scanner = new Scanner(System.in);

        //String ime = scanner.nextLine();
        System.out.println("Unesite duzinu prve stranice.");
        x = scanner.nextDouble();

        System.out.println("Unesite druge stranice.");
        y=scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println("Hipotenuza je: " + z + "cm");

        scanner.close();*/

       x = Double.parseDouble(JOptionPane.showInputDialog("Unesi duzinu prve stranice"));
       y = Double.parseDouble(JOptionPane.showInputDialog("Unesi duzinu druge stranice"));
       z = Math.sqrt((x*x) + (y*y));

       JOptionPane.showMessageDialog(null, "Duzina hipotenuze je: " + z + "cm");


    }
}
