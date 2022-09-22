package constructors;

public class Human {

    String ime;
    int god;
    double tezina;

    Human(String ime, int god, double tezina) {

        this.ime = ime;
        this.god = god;
        this.tezina = tezina;

        }
    void ishrana(){
        System.out.println(this.ime+" jede gurmannsku");

    }
}
