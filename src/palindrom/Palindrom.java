package palindrom;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        String a;
        String b;
        b = "";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Unesi rec");
        a = scanner.nextLine();
        if (a.charAt(0) != a.charAt(a.length() - 1)) {
            System.out.println("Rec nije palindrom");
            System.exit(0);
        }

        for (int i = a.length() - 1; i >= 0; i--) {
            b = b + a.charAt(i);
        }
        if (a.equals(b)) {
            System.out.println("Rec je palindrom");
        } else {
            System.out.println("Rec nije palindrom");
        }
    }
}
