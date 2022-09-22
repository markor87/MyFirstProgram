package lekcije_pre_oop;

import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesite ime? ");
        String ime = scanner.nextLine();

        System.out.println("Unesite godinu rodjenja? " );
        int god = scanner.nextInt();
        scanner.nextLine(); //koristiti nakon scanner.nextInt();

        System.out.println("Hello " + ime + ", ti imas " + god + " godina.");
    }
}