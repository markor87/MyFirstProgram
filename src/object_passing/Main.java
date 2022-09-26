package object_passing;

public class Main {
    public static void main(String[] args) {
        Garaza garaza = new Garaza();

        Automobil automobil = new Automobil("BMW");
        Automobil automobil2 = new Automobil("Audi");

        Bicikla bicikla1 = new Bicikla("BMX");

        garaza.park(automobil);
        garaza.park(automobil2);

        garaza.park(bicikla1);
    }
}
