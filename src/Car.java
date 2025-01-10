public class Car extends Vehicle {
private int fuel=0;


    public Car (String name){
        super(name,"motorized");
        super.setPrice(100000.0);
    }
    public Car(String name, double price){
        super(name,"motorized");
        super.setPrice(price);

    }
    public Car(double price){
        super("default-car","motorized");
        super.setPrice(price);

    }



    @Override
    public String soundWarning() {
        return "tuut-tuut";
    }

    // Fingerar bara till cars, inte tex bikes för att funktionen finns i Car, inte i superklassen.
    public void refuel(){
        this.fuel=100;
    }
}
