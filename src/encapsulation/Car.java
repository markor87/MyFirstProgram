package encapsulation;

public class Car {
    private String make;
    private String model;
    private int god;

    Car(String make,String model,int god){
        this.make = make;
        this.model = model;
        this.god = god;

    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public int getGod(){
        return god;
    }
}
