package lekcije_pre_oop;

import java.util.Scanner;
public class while_loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String ime = "";

        while (ime.isBlank()) {
            System.out.println("Unesi ime: ");
            ime = scanner.nextLine();
        }
        System.out.println("Hello " + ime);
    }
}
