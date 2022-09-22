package lekcije_pre_oop;

import java.util.Scanner;
public class logical_operators {
    public static void main(String[] args) {

        /*&& = i
        || = ili
        ! = not*/

        Scanner scanner = new Scanner(System.in);

        System.out.println("Pritisnite q ili Q da izadjete iz djire.");

        String odgovor = scanner.next();

        if(odgovor.equals("q") || odgovor.equals("Q")) {
            System.out.println("Quit");
        }
        else {
            System.out.println("I dalje si u djiri");
        }

    }
}
