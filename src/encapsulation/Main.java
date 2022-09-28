package encapsulation;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Kia", "Ceed", 2020);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getGod());
    }
}
