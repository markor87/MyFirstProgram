package lekcije_pre_oop;

public class methods {
    public static void main(String[] args) {
        String ime = "Marko";
        int godine = 34;


        hello(ime, godine);
    }

    static void hello(String ime, int godine) {
        System.out.println("Hello " + ime + " " + godine);
    }

}
