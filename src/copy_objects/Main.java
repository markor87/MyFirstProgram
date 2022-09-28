package copy_objects;

// nista nisam razumeo mrs

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Kia", "Ceed", 2020);
//        Car car2 = new Car("Opel", "Meriva", 2010);
//        car2.copy(car1);
        Car car2 = new Car(car1);


        System.out.println(car2.getMake());
    }
}
