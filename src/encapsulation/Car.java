package encapsulation;

public class Car {
    private String make;
    private String model;
    private int god;

    Car(String make,String model,int god){
        this.setMake(make);
        this.setModel(model);
        this.setGod(god);

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

    public void setMake(String make){
        this.make = make;
    }
    public void setModel(String model){
        this.model = model;
    }
    public void setGod(int god){
        this.god = god;
    }
}
