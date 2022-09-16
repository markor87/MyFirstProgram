import java.util.Scanner;

public class nested_loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows;
        int columns;
        String symbol = "";
        int i;
        int j;

        System.out.println("Unesite broj redova");
        rows = scanner.nextInt();

        System.out.println("Unesite broj kolona");
        columns = scanner.nextInt();

        System.out.println("Unesite simbol");
        symbol = scanner.next();

        for (i = 1; i <= rows; i++) {
            System.out.println();
            for (j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }

    }
}
