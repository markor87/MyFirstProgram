package palindrom;

public class Palindrom {
    public static void main(String[] args) {
        String a = "Radar";
        String b = "";

        for (int i = a.length(); i >= 0; i--) {
            b += a.charAt(i);


        }
        System.out.println(b);
    }
}
